package com.music.patienttracker.domain.model

data class Patient (
    val name: String,
    val age: Int,
    val gender: Int,
    val doctorAssigned: String,
    val prescription: String,
    val patientId: Int? = null
)