package pol.rubiano.simpsonspool.features.locations.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "locations")
data class LocationEntity(
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "image_path") val imagePath: String,
    @ColumnInfo(name = "town") val town: String,
    @ColumnInfo(name = "use") val use: String,
)