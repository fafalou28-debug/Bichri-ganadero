import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cows")
data class Cow(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val breed: String,
    val age: Int
)

@Entity(tableName = "milk_productions")
data class MilkProduction(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val cowId: Long,
    val amount: Double,
    val date: String
)

@Entity(tableName = "feedings")
data class Feeding(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val cowId: Long,
    val foodType: String,
    val amount: Double,
    val date: String
)

@Entity(tableName = "veterinary_records")
data class VeterinaryRecord(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val cowId: Long,
    val description: String,
    val date: String
)