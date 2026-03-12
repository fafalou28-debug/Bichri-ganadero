package com.bichri.ganadero.data.dao

import androidx.room.*
import com.bichri.ganadero.data.model.Cow

@Dao
interface CowDao {
    @Insert
    suspend fun insertCow(cow: Cow): Long

    @Update
    suspend fun updateCow(cow: Cow)

    @Delete
    suspend fun deleteCow(cow: Cow)

    @Query("SELECT * FROM cows")
    suspend fun getAllCows(): List<Cow>

    @Query("SELECT * FROM cows WHERE id = :cowId")
    suspend fun getCowById(cowId: Long): Cow?

    @Query("SELECT COUNT(*) FROM cows")
    suspend fun getCowCount(): Int

    @Query("DELETE FROM cows WHERE id = :cowId")
    suspend fun deleteCowById(cowId: Long)
}