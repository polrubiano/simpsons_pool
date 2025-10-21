package pol.rubiano.simpsonspool.features.locations.domain.models

import pol.rubiano.simpsonspool.features.locations.data.local.entities.LocationEntity

fun Location.toEntity(): LocationEntity {
    return LocationEntity(
        id = id,
        name = name,
        imagePath = imagePath,
        town = town,
        use = use,
    )
}