package com.music.patienttracker.Presentation.patient_detail

data class PatientDetailUiState(
    val name: String ="",
    val age:String="",
    val gender:Int=0,
    val doctorAssigned:String="",
    val prescription:String=""
)