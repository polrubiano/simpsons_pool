package pol.rubiano.simpsonspool.features.episodes.domain.repositories

import pol.rubiano.simpsonspool.features.episodes.domain.models.Episode

interface EpisodesRepository {
    suspend fun getEpisodeById(id: Int): Result<Episode>
    suspend fun getEpisodes(): Result<List<Episode>>
}