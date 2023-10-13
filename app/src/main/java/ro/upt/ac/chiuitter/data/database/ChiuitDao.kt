package ro.upt.ac.chiuitter.data.database

import androidx.room.Dao
import androidx.room.Query


@Dao
interface ChiuitDao {

    @Query("SELECT * FROM chiuits")
    fun getAll(): List<ChiuitEntity>

    // TODO 11: Define the insert operation.

    // TODO 14: Define the delete operation.

}