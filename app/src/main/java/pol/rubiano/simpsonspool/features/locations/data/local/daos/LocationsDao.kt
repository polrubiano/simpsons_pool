package pol.rubiano.simpsonspool.features.locations.data.local.daos

import androidx.room.Dao
import androidx.room.Query
import pol.rubiano.simpsonspool.features.locations.data.local.entities.LocationEntity

@Dao
interface LocationsDao {

    @Query("SELECT * FROM locations WHERE id = :id LIMIT 1")
    suspend fun getLocationById(id: String): LocationEntity

    @Query("SELECT * FROM locations ORDER BY id")
    suspend fun getLocations(): List<LocationEntity>
}