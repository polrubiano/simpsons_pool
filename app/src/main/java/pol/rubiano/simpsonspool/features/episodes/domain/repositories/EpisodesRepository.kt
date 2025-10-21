package pol.rubiano.simpsonspool.features.episodes.domain.repositories

import pol.rubiano.simpsonspool.features.episodes.domain.models.Episode

interface EpisodesRepository {
    fun getEpisodeById(id: Int): Result<Episode>
    fun getEpisodes(): Result<List<Episode>>
}