package pol.rubiano.simpsonspool.app.data.apimodels

import pol.rubiano.simpsonspool.app.domain.models.Character

fun CharacterApiModel.toCharacter(): Character {
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