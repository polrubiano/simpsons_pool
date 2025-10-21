package pol.rubiano.simpsonspool.features.characters.data.local.entities

import pol.rubiano.simpsonspool.features.characters.domain.models.Character

fun CharacterEntity.toModel(): Character {
    return Character(
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