package pol.rubiano.simpsonspool.features.characters.data.remote

import pol.rubiano.simpsonspool.app.data.apiCall
import pol.rubiano.simpsonspool.app.data.remote.ApiService
import pol.rubiano.simpsonspool.app.domain.models.ApiResponse
import pol.rubiano.simpsonspool.features.characters.data.apimodels.CharacterApiModel

class CharactersRemoteDataSource(
    private val apiService: ApiService
) {
    suspend fun getCharacters(): Result<ApiResponse<CharacterApiModel>> {
        return apiCall { apiService.getCharacters() }
    }
}