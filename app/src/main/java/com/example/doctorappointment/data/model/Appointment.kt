package com.example.doctorappointment.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "appointment")
data class Appointment(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val date: Long
)
