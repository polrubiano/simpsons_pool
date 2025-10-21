package pol.rubiano.simpsonspool.features.locations.domain.usecases

import pol.rubiano.simpsonspool.features.locations.domain.models.Location
import pol.rubiano.simpsonspool.features.locations.domain.repositories.LocationsRepository

class GetLocationByIdUseCase(
    private val repository: LocationsRepository
) {
    suspend operator fun invoke(id: Int): Result<Location> = repository.getLocationById(id)
}