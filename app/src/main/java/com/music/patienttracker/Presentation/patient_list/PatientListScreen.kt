package com.music.patienttracker.Presentation.patient_list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.music.patienttracker.Presentation.theme.Pink80
import com.music.patienttracker.R
import com.music.patienttracker.domain.model.Patient


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PatientListScreen(
    onFabClicked:()->Unit,
    onItemClicked:(Int?)->Unit
) {

    val patientList = listOf(
        Patient(
            name = "sghjs",
            age = 24,
            gender = 1,
            doctorAssigned = "shsnhshs",
            prescription = "eat food"
        ), Patient(
            name = "Fahad",
            age = 2,
            gender = 1,
            doctorAssigned = "shsnhshs",
            prescription = "eat food"
        )
    )
    val scrollState = rememberScrollState()

    Scaffold(
        topBar = { ListAppBar() }, floatingActionButton = { ListFAB(onFabClicked) }) { padding ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier.padding(padding),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(patientList) { patient ->
                PatientItem(
                    patient = patient,
                    onItemClicked = {onItemClicked(patient.patientId)},
                    onDeleteConfirm = {}
                )
            }
        }

        if(patientList.isEmpty()){
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Add Patients details\nby pressing add button.",
                    style = MaterialTheme.typography.headlineSmall,
                    textAlign = TextAlign.Center
                )

            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListAppBar()
{
    TopAppBar(
        title = { 
            Text(
                text = "Patient Tracker",
                color= colorResource(R.color.white),
                style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
            )
        }
        , colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Pink80)
    )
}


@Composable
fun ListFAB(onFabClicked: () -> Unit) {
    FloatingActionButton(onClick = { onFabClicked() }) {
        Image(
            imageVector = Icons.Filled.Add,
            contentDescription = "Add Patient Butoon"
        )
    }
}