package pol.rubiano.simpsonspool.features.characters.data

import pol.rubiano.simpsonspool.app.errors.AppError
import pol.rubiano.simpsonspool.features.characters.data.apimodels.toCharacter
import pol.rubiano.simpsonspool.features.characters.data.remote.CharactersRemoteDataSource
import pol.rubiano.simpsonspool.features.characters.domain.models.Character
import pol.rubiano.simpsonspool.features.characters.domain.repositories.CharactersRepository

class CharactersDataRepository(
    private val remote: CharactersRemoteDataSource
) : CharactersRepository {

    override suspend fun getCharacterById(id: Int): Result<Character> {
        TODO("Not yet implemented")
    }

    override suspend fun getCharacters(): Result<List<Character>> {
        val result = remote.getCharacters()
        return result.fold(
            onSuccess = { apiResponse ->
                val characters = apiResponse.results.map { it.toCharacter() }
                Result.success(characters)
            },
            onFailure = {
                Result.failure(AppError.AppUnknowError)
            }
        )
    }
}