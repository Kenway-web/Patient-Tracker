package com.music.patienttracker.data.Local

import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.music.patienttracker.domain.model.Patient


@Database(
    entities = [Patient::class],
    version = 1
)
abstract class PatientDatabase : RoomDatabase(){
        abstract val patientDao:PatientDao
}