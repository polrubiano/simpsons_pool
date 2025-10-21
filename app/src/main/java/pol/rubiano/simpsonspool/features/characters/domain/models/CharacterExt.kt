package pol.rubiano.simpsonspool.features.characters.domain.models

import pol.rubiano.simpsonspool.features.characters.data.local.entities.CharacterEntity

fun Character.toEntity(): CharacterEntity {
    return CharacterEntity(
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