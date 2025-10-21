package pol.rubiano.simpsonspool.features.episodes.domain.usecases

import pol.rubiano.simpsonspool.features.episodes.domain.models.Episode
import pol.rubiano.simpsonspool.features.episodes.domain.repositories.EpisodesRepository

class GetEpisodeByIdUseCase(
    private val repository: EpisodesRepository
) {
    suspend operator fun invoke(id: Int): Result<Episode> = repository.getEpisodeById(id)
}