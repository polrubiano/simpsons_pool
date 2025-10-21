package pol.rubiano.simpsonspool.features.locations.data.local.entities

import pol.rubiano.simpsonspool.features.locations.domain.models.Location

fun LocationEntity.toModel(): Location {
    return Location(
        id = id,
        name = name,
        imagePath = imagePath,
        town = town,
        use = use,
    )
}