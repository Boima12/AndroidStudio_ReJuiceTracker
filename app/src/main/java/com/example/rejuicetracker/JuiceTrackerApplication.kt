package com.example.rejuicetracker

import android.app.Application
import com.example.rejuicetracker.data.AppContainer
import com.example.rejuicetracker.data.AppDataContainer

class JuiceTrackerApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}