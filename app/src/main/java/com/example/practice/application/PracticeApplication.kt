package com.example.practice.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Hilt currently supports the following Android classes:
 *
    Application (by using @HiltAndroidApp)
    ViewModel (by using @HiltViewModel)
    Activity
    Fragment
    View
    Service
    BroadcastReceiver
 */
@HiltAndroidApp
class PracticeApplication : Application() {
}