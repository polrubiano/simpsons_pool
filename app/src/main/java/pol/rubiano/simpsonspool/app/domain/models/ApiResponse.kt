package pol.rubiano.simpsonspool.app.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse<T>(
    val count: Int,
    val next: String?,
    val prev: String?,
    val pages: Int,
    val results: List<T>
)