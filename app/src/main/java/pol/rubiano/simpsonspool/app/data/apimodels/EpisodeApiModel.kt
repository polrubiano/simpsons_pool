package pol.rubiano.simpsonspool.app.data.apimodels

import com.google.gson.annotations.SerializedName

data class EpisodeApiModel(
    @SerializedName("id") val id: Int,
    @SerializedName("airdate") val airdate: String,
    @SerializedName("episode_number") val episodeNumber: Int,
    @SerializedName("image_path") val imagePath: String,
    @SerializedName("name") val name: String,
    @SerializedName("season") val season: Int,
    @SerializedName("synopsis") val synopsis: String,
)
