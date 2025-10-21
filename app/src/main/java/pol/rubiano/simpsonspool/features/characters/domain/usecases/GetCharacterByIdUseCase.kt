package pol.rubiano.simpsonspool.features.characters.domain.usecases

import pol.rubiano.simpsonspool.features.characters.domain.models.Character
import pol.rubiano.simpsonspool.features.characters.domain.repositories.CharactersRepository

class GetCharacterByIdUseCase(
  private val repository: CharactersRepository
) {
    suspend operator fun invoke(id: Int): Result<Character> = repository.getCharacterById(id)
}