import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.Delete;
import java.util.List;

@Dao
public interface MilkProductionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(MilkProduction milkProduction);

    @Update
    void update(MilkProduction milkProduction);

    @Delete
    void delete(MilkProduction milkProduction);

    @Query("SELECT * FROM MilkProduction WHERE cowId = :cowId")
    List<MilkProduction> selectByCowId(int cowId);

    @Query("SELECT SUM(amount) FROM MilkProduction")
    float calculateTotalMilkProduction();

    @Query("SELECT AVG(amount) FROM MilkProduction")
    float calculateAverageMilkProduction();
}
