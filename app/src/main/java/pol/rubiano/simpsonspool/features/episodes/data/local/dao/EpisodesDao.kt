package pol.rubiano.simpsonspool.features.episodes.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import pol.rubiano.simpsonspool.features.episodes.data.local.entities.EpisodeEntity

@Dao
interface EpisodesDao {

    @Query("SELECT * FROM episodes WHERE id = :id LIMIT 1")
    suspend fun getEpisodeById(id: String): EpisodeEntity

    @Query("SELECT * FROM episodes ORDER BY episode_number ")
    suspend fun getEpisodes(): List<EpisodeEntity>
}