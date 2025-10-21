package pol.rubiano.simpsonspool.app.domain.models

import pol.rubiano.simpsonspool.app.data.apimodels.LocationApiModel

fun Location.toApiModel(): LocationApiModel {
    return LocationApiModel(
        id = id,
        name = name,
        imagePath = imagePath,
        town = town,
        use = use,
    )
}