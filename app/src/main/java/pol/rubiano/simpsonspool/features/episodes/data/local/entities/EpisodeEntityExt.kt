package pol.rubiano.simpsonspool.features.episodes.data.local.entities

import pol.rubiano.simpsonspool.features.episodes.domain.models.Episode

fun EpisodeEntity.toModel(): Episode {
    return Episode(
        id = id,
        airdate = airdate,
        episodeNumber = episodeNumber,
        imagePath = imagePath,
        name = name,
        season = season,
        synopsis = synopsis,
    )
}