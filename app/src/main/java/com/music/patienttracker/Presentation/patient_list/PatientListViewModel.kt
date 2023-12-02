package com.music.patienttracker.Presentation.patient_list

import androidx.lifecycle.ViewModel
import com.music.patienttracker.domain.repository.PatientRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class PatientListViewModel @Inject constructor(
    private val repository: PatientRepository
) :ViewModel(){

}