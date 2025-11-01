package pol.rubiano.simpsonspool.app.data

import android.util.Log
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import pol.rubiano.simpsonspool.app.errors.AppError
import retrofit2.Response
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

suspend fun <T : Any> apiCall(call: suspend () -> Response<T>): Result<T> {

    val response: Response<T>

    try {
        response = call.invoke()
    } catch (exception: Throwable) {
        Log.d("@dev", "Unknown API error", exception)
        return when (exception) {
            is ConnectException -> Result.failure(AppError.AppConnectionError)
            is UnknownHostException -> Result.failure(AppError.AppInternetError)
            is SocketTimeoutException -> Result.failure(AppError.AppInternetError)
            else -> Result.failure(AppError.AppUnknowError)
        }
    }

    if (response.isSuccessful) {
        val body = response.body()
        return if (body != null) {
            Result.success(body)
        } else {
            Log.d("@dev", "API call successful but body was null")
            Result.failure(AppError.AppUnknowError)
        }
    } else {
        val errorBody = response.errorBody()?.string()
        if (!errorBody.isNullOrEmpty()) {
            try {
                val errorJson = Json.parseToJsonElement(errorBody).jsonObject
                val errorMessage = errorJson["message"]?.jsonPrimitive?.content ?: "Not specified"
                Log.d("@dev", "API Error Body (code ${response.code()}): $errorMessage")
            } catch (e: Exception) {
                Log.d("@dev", "Failed to parse error body (code ${response.code()}): $errorBody", e)
            }
        } else {
            Log.d("@dev", "API Error with empty body (code: ${response.code()})")
        }

        return when (response.code()) {
            in 400..499 -> Result.failure(AppError.NoResultsError)
            in 500..599 -> Result.failure(AppError.AppServerError)
            else -> Result.failure(AppError.AppUnknowError)
        }
    }
}