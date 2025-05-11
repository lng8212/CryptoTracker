package com.longkd.cryptotracker

import android.app.Application
import com.longkd.cryptotracker.crypto.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * @Author: longkd
 * @Since: 17:17 - 11/5/25
 */
class CryptoTrackerApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CryptoTrackerApp)
            androidLogger()

            modules(appModule)
        }
    }
}