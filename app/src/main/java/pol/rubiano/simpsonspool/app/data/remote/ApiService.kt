package pol.rubiano.simpsonspool.app.data.remote

import pol.rubiano.simpsonspool.app.domain.models.ApiResponse
import pol.rubiano.simpsonspool.features.characters.data.apimodels.CharacterApiModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("characters")
    suspend fun getCharacters(): Response<ApiResponse<CharacterApiModel>>
}