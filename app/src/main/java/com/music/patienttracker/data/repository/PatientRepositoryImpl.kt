package com.music.patienttracker.data.repository

import com.music.patienttracker.data.Local.PatientDao
import com.music.patienttracker.domain.model.Patient
import com.music.patienttracker.domain.repository.PatientRepository
import kotlinx.coroutines.flow.Flow

class PatientRepositoryImpl(private val dao: PatientDao):PatientRepository {
    override suspend fun addOrUpdatePatient(patient: Patient) {
      dao.addOrUpdatePatient(patient = patient)
    }

    override suspend fun deletePatient(patient: Patient) {
        dao.deletePatient(patient)
    }

    override suspend fun getPatientById(patientId: Int): Patient? {
        return dao.getPatientById(patientId)
    }

    override fun getAllPatient(): Flow<List<Patient>> {
        return dao.getAllPatient()
    }

}