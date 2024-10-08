package com.example.rejuicetracker.ui

import android.app.Application
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.rejuicetracker.JuiceTrackerApplication

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            JuiceTrackerViewModel(juiceTrackerApplication().container.juiceRepository)
        }
    }
}

fun CreationExtras.juiceTrackerApplication(): JuiceTrackerApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as JuiceTrackerApplication)
