package pol.rubiano.simpsonspool.features.locations.domain.repositories

import pol.rubiano.simpsonspool.features.locations.domain.models.Location

interface LocationsRepository {
    fun getLocationById(id: Int): Result<Location>
    fun getLocations(): Result<List<Location>>
}