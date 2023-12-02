package com.music.patienttracker.di

import android.app.Application
import androidx.room.Room
import com.music.patienttracker.data.Local.PatientDatabase
import com.music.patienttracker.data.repository.PatientRepositoryImpl
import com.music.patienttracker.domain.repository.PatientRepository
import com.music.patienttracker.util.Constants.PATIENT_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
     fun providePatientDatabase(
         app:Application
     ):PatientDatabase{
         return Room.databaseBuilder(
            app,
             PatientDatabase::class.java,
             PATIENT_DATABASE
         ).build()
     }

    @Provides
    @Singleton
    fun ProvidePatientRepository(
        db:PatientDatabase
    ):PatientRepository{
        return PatientRepositoryImpl(dao =db.patientDao )
    }

}