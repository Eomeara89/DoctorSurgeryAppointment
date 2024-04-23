package com.example.doctorappointment.data.repository

import com.example.doctorappointment.data.db.dao.AppointmentDao
import com.example.doctorappointment.data.model.Appointment

class AppointmentRepository(private val appointmentDao: AppointmentDao) {

    suspend fun getAllAppointments(): List<Appointment> {
        return appointmentDao.getAllAppointments()
    }

    suspend fun insertAppointment(appointment: Appointment) {
        appointmentDao.insertAppointment(appointment)
    }

    suspend fun deleteAppointment(appointment: Appointment) {
        appointmentDao.deleteAppointment(appointment)
    }

    suspend fun updateAppointment(appointment: Appointment) {
        appointmentDao.updateAppointment(appointment)
    }
}