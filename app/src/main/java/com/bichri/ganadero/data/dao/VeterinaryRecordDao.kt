import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface VeterinaryRecordDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(veterinaryRecord: VeterinaryRecord)

    @Update
    suspend fun update(veterinaryRecord: VeterinaryRecord)

    @Query("SELECT * FROM veterinary_records WHERE id = :id")
    suspend fun getById(id: Long): VeterinaryRecord?

    @Query("DELETE FROM veterinary_records WHERE id = :id")
    suspend fun deleteById(id: Long)

    @Query("SELECT * FROM veterinary_records")
    suspend fun getAll(): List<VeterinaryRecord>
}