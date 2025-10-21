package pol.rubiano.simpsonspool.features.characters.domain.models

data class Character(
    val id: Int,
    val age: Int,
    val birthdate: String,
    val gender: String,
    val name: String,
    val occupation: String,
    val portraitPath: String,
    val phrases: List<String>,
    val status: String
)