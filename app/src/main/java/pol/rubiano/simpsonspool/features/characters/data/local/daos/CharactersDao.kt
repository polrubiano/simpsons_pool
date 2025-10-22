package pol.rubiano.simpsonspool.features.characters.data.local.daos

import androidx.room.Dao
import androidx.room.Query
import pol.rubiano.simpsonspool.features.characters.data.local.entities.CharacterEntity

@Dao
interface CharactersDao {

    @Query("SELECT * FROM characters WHERE id = :id LIMIT 1")
    suspend fun getCharacterById(id: String): CharacterEntity

    @Query("SELECT * FROM characters ORDER BY id")
    suspend fun getCharacters(): List<CharacterEntity>
}