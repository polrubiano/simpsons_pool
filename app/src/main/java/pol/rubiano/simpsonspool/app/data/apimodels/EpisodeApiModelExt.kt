package pol.rubiano.simpsonspool.app.data.apimodels

import pol.rubiano.simpsonspool.app.domain.models.Episode

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