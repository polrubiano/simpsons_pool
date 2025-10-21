package pol.rubiano.simpsonspool.features.episodes.domain.usecases

import pol.rubiano.simpsonspool.features.episodes.domain.models.Episode
import pol.rubiano.simpsonspool.features.episodes.domain.repositories.EpisodesRepository

class GetEpisodesUseCase(
    private val repository: EpisodesRepository
) {
    suspend operator fun invoke(): Result<List<Episode>> = repository.getEpisodes()
}