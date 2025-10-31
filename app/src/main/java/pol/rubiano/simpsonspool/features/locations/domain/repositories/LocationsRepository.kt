package pol.rubiano.simpsonspool.features.locations.domain.repositories

import pol.rubiano.simpsonspool.features.locations.domain.models.Location

interface LocationsRepository {
    suspend fun getLocationById(id: Int): Result<Location>
    suspend fun getLocations(): Result<List<Location>>
}