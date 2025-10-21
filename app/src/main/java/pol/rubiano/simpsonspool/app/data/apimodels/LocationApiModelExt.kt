package pol.rubiano.simpsonspool.app.data.apimodels

import pol.rubiano.simpsonspool.app.domain.models.Location

fun LocationApiModel.toLocation(): Location {
    return Location(
        id = id,
        name = name,
        imagePath = imagePath,
        town = town,
        use = use,
    )
}