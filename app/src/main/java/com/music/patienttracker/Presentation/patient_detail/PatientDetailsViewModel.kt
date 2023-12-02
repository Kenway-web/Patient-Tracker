package com.music.patienttracker.Presentation.patient_detail

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.music.patienttracker.domain.repository.PatientRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class PatientDetailsViewModel @Inject constructor(private val repository: PatientRepository) : ViewModel() {

//    "val state by mutableStateOf (PatientUiDetailsState()" this way
//    instead of " private val _state = MutableStateFlow (PatientUiDetailsState()) val state = _state.asStateFlow"
//
internal var state by mutableStateOf(PatientDetailUiState())

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