package pol.rubiano.simpsonspool.features.locations.domain.usecases

import pol.rubiano.simpsonspool.features.locations.domain.models.Location
import pol.rubiano.simpsonspool.features.locations.domain.repositories.LocationsRepository

class GetLocationsUseCase(
    private val repository: LocationsRepository
) {
    suspend operator fun invoke(): Result<List<Location>> = repository.getLocations()
}