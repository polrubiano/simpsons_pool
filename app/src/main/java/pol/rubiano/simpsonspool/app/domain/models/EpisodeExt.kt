package pol.rubiano.simpsonspool.app.domain.models

import pol.rubiano.simpsonspool.app.data.apimodels.EpisodeApiModel

fun Episode.toApiModel(): EpisodeApiModel {
    return EpisodeApiModel(
        id = id,
        airdate = airdate,
        episodeNumber = episodeNumber,
        imagePath = imagePath,
        name = name,
        season = season,
        synopsis = synopsis,
    )
}