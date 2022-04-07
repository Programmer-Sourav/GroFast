package com.portfolio.apps.outsource.grofast

import android.app.Application
import android.content.Context

class  ApplicationClass : Application() {

    init {
        instance = this
    }

    companion object {
        private lateinit var instance: ApplicationClass

        fun applicationContext() : ApplicationClass {
            return instance as ApplicationClass
        }
    }

    override fun onCreate() {
        super.onCreate()
    }
}
