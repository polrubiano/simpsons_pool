package pol.rubiano.simpsonspool.features.episodes.data.apimodels

import pol.rubiano.simpsonspool.features.episodes.domain.models.Episode

fun EpisodeApiModel.toEpisode(): Episode {
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