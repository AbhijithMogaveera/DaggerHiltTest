package com.abhijith.daggerhilttest

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ApplicationScoped : Application()