package pol.rubiano.simpsonspool.features.characters.domain.models

import pol.rubiano.simpsonspool.features.characters.data.apimodels.CharacterApiModel

fun Character.toApiModel(): CharacterApiModel {
    return CharacterApiModel(
        id = id,
        age = age,
        birthdate = birthdate,
        gender = gender,
        name = name,
        occupation = occupation,
        portraitPath = portraitPath,
        phrases = phrases,
        status = status,
    )
}