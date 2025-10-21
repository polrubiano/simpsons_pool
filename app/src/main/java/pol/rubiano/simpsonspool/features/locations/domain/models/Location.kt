package pol.rubiano.simpsonspool.features.locations.domain.models

data class Location(
    val id: String,
    val name: String,
    val imagePath: String,
    val town: String,
    val use: String,
)