package com.example.doctorappointment.data.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.doctorappointment.data.model.Appointment

@Dao
interface AppointmentDao {
    @Query("SELECT * FROM appointment")
    suspend fun getAllAppointments(): List<Appointment>

    @Insert
    suspend fun insertAppointment(appointment: Appointment)

    @Delete
    suspend fun deleteAppointment(appointment: Appointment)

    @Update
    suspend fun updateAppointment(appointment: Appointment)

    // Add other methods for updating and deleting appointments if needed
}