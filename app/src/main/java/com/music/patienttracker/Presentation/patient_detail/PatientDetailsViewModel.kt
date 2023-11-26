package com.music.patienttracker.Presentation.patient_detail

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class PatientDetailsViewModel : ViewModel() {

    var state by mutableStateOf(PatientDetailUiState())

    fun onEvent(event: PatientDetailEvents) {
        when (event) {
            is PatientDetailEvents.EnterName -> {
                state = state.copy(name = event.name)
            }

            is PatientDetailEvents.EnterAge -> {
                state = state.copy(age = event.age)
            }

            is PatientDetailEvents.EnterAssignedDoctor -> {
                state = state.copy(doctorAssigned = event.doctor)
            }

            is PatientDetailEvents.EnteredPrescription -> {
                state = state.copy(prescription = event.prescription)
            }

            PatientDetailEvents.SelectedFemale -> {
                state = state.copy(gender = 2)
            }

            PatientDetailEvents.SelectedMale -> {
                state = state.copy(gender = 1)
            }

            PatientDetailEvents.SaveButton -> TODO()
        }
    }


}