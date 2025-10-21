package pol.rubiano.simpsonspool.app.data.apimodels

import com.google.gson.annotations.SerializedName

data class CharacterApiModel(
    @SerializedName("id") val id: Int,
    @SerializedName("age") val age: Int,
    @SerializedName("birthdate") val birthdate: String,
    @SerializedName("gender") val gender: String,
    @SerializedName("name") val name: String,
    @SerializedName("occupation") val occupation: String,
    @SerializedName("portrait_path") val portraitPath: String,
    @SerializedName("phrases") val phrases: List<String>,
    @SerializedName("status") val status: String
)
