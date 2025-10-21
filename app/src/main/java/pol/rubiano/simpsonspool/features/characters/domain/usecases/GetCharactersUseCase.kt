package pol.rubiano.simpsonspool.features.characters.domain.usecases

import pol.rubiano.simpsonspool.features.characters.domain.models.Character
import pol.rubiano.simpsonspool.features.characters.domain.repositories.CharactersRepository

class GetCharactersUseCase(
    private val repository: CharactersRepository
) {
    suspend operator fun invoke(): Result<List<Character>> = repository.getCharacters()
}