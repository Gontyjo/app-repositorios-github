package com.example.portfliogithub

import android.app.Application
import com.example.portfliogithub.data.di.DataModule
import com.example.portfliogithub.data.domain.DomainModule
import com.example.portfliogithub.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}