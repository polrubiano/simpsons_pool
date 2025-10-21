package pol.rubiano.simpsonspool.features.locations.domain.models

import pol.rubiano.simpsonspool.features.locations.data.apimodels.LocationApiModel

fun Location.toApiModel(): LocationApiModel {
    return LocationApiModel(
        id = id,
        name = name,
        imagePath = imagePath,
        town = town,
        use = use,
    )
}