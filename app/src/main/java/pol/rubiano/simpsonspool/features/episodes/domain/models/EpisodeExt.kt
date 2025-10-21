package pol.rubiano.simpsonspool.features.episodes.domain.models

import pol.rubiano.simpsonspool.features.episodes.data.apimodels.EpisodeApiModel

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