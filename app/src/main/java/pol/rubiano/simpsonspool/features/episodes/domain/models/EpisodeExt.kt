package pol.rubiano.simpsonspool.features.episodes.domain.models

import pol.rubiano.simpsonspool.features.episodes.data.local.entities.EpisodeEntity

fun Episode.toEntity(): EpisodeEntity {
    return EpisodeEntity(
        id = id,
        airdate = airdate,
        episodeNumber = episodeNumber,
        imagePath = imagePath,
        name = name,
        season = season,
        synopsis = synopsis,
    )
}