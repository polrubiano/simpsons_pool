package pol.rubiano.simpsonspool.features.characters.data.apimodels

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CharacterApiModel(
    @SerialName("id") val id: Int,
    @SerialName("age") val age: Int = 0,
    @SerialName("birthdate") val birthdate: String = "",
    @SerialName("gender") val gender: String,
    @SerialName("name") val name: String,
    @SerialName("occupation") val occupation: String,
    @SerialName("portrait_path") val portraitPath: String,
    @SerialName("phrases") val phrases: List<String>,
    @SerialName("status") val status: String
)
