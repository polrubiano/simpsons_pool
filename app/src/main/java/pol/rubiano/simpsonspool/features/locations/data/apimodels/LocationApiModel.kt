package pol.rubiano.simpsonspool.features.locations.data.apimodels

import com.google.gson.annotations.SerializedName

data class LocationApiModel(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("image_path") val imagePath: String,
    @SerializedName("town") val town: String,
    @SerializedName("use") val use: String,
)
