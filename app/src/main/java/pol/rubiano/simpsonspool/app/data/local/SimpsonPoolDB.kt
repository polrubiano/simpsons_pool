package pol.rubiano.simpsonspool.app.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import pol.rubiano.simpsonspool.features.characters.data.local.daos.CharactersDao
import pol.rubiano.simpsonspool.features.characters.data.local.entities.CharacterEntity
import pol.rubiano.simpsonspool.features.episodes.data.local.dao.EpisodesDao
import pol.rubiano.simpsonspool.features.episodes.data.local.entities.EpisodeEntity
import pol.rubiano.simpsonspool.features.locations.data.local.daos.LocationsDao
import pol.rubiano.simpsonspool.features.locations.data.local.entities.LocationEntity

@Database(
    entities = [
        CharacterEntity::class,
        EpisodeEntity::class,
        LocationEntity::class
    ],
    version = 1,
    exportSchema = false
)

@TypeConverters(Converters::class)
abstract class SimpsonPoolDB : RoomDatabase() {
    abstract fun charactersDao(): CharactersDao
    abstract fun episodesDao(): EpisodesDao
    abstract fun locationsDao(): LocationsDao
}