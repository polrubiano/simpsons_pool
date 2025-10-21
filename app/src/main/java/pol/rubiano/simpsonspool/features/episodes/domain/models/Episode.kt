package pol.rubiano.simpsonspool.features.episodes.domain.models

data class Episode(
    val id: Int,
    val airdate: String,
    val episodeNumber: Int,
    val imagePath: String,
    val name: String,
    val season: Int,
    val synopsis: String,
)
