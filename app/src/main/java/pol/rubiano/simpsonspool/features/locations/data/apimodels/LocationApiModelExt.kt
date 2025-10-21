package pol.rubiano.simpsonspool.features.locations.data.apimodels

import pol.rubiano.simpsonspool.features.locations.domain.models.Location

fun LocationApiModel.toLocation(): Location {
    return Location(
        id = id,
        name = name,
        imagePath = imagePath,
        town = town,
        use = use,
    )
}