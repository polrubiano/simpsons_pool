package pol.rubiano.simpsonspool.features.episodes.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "episodes")
data class EpisodeEntity(
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "airdate") val airdate: String,
    @ColumnInfo(name = "episode_number") val episodeNumber: Int,
    @ColumnInfo(name = "imagePath") val imagePath: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "season") val season: Int,
    @ColumnInfo(name = "synopsis") val synopsis: String,
)