package pol.rubiano.simpsonspool.features.characters.domain.repositories

import pol.rubiano.simpsonspool.features.characters.domain.models.Character

interface CharactersRepository {
    fun getCharacterById(id: Int): Result<Character>
    fun getCharacters(): Result<List<Character>>
}