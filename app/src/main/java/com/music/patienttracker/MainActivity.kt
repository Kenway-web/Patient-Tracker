package com.music.patienttracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.music.patienttracker.Presentation.patient_detail.PatientDetailScreen
import com.music.patienttracker.Presentation.patient_detail.PatientDetailsViewModel

import com.music.patienttracker.Presentation.patient_list.PatientListScreen
import com.music.patienttracker.Presentation.theme.PatientTrackerTheme
import com.music.patienttracker.navigation.NavGraphSetup

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PatientTrackerTheme {
                // A surface container using the 'background' color from the theme
               val navController = rememberNavController()
                NavGraphSetup(navController = navController)
            }
        }
    }
}

