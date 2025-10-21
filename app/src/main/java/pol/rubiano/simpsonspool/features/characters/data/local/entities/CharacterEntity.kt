package pol.rubiano.simpsonspool.features.characters.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "characters")
data class CharacterEntity(
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "age") val age: Int,
    @ColumnInfo(name = "birthdate") val birthdate: String,
    @ColumnInfo(name = "gender") val gender: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "occupation") val occupation: String,
    @ColumnInfo(name = "portrait_path") val portraitPath: String,
    @ColumnInfo(name = "phrases") val phrases: List<String>,
    @ColumnInfo(name = "status") val status: String,
)