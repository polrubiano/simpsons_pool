package pol.rubiano.simpsonspool.features.characters.domain.repositories

import pol.rubiano.simpsonspool.features.characters.domain.models.Character

interface CharactersRepository {
    suspend fun getCharacterById(id: Int): Result<Character>
    suspend fun getCharacters(): Result<List<Character>>
}