package com.music.patienttracker.Presentation.patient_detail


// seled class of all events
sealed class PatientDetailEvents{
    data class EnterName(val name:String):PatientDetailEvents()
    data class EnterAge(val age:String):PatientDetailEvents()
    data class EnterAssignedDoctor(val doctor:String):PatientDetailEvents()
    data class EnteredPrescription(val prescription:String):PatientDetailEvents()
    object SelectedMale:PatientDetailEvents()
    object SelectedFemale:PatientDetailEvents()
    object SaveButton:PatientDetailEvents()

}
