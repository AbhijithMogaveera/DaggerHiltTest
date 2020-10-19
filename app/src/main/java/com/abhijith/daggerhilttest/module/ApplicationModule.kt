package com.abhijith.daggerhilttest.module

import com.abhijith.daggerhilttest.consumingFromApplicationComponent
import com.abhijith.daggerhilttest.module.data.ApplicationModuleData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton
import kotlin.random.Random
import kotlin.random.nextInt

@Module
@InstallIn(ApplicationComponent::class)
object ApplicationModule {

    @Singleton
    @Provides
    fun begin():ApplicationModuleData {
        return ApplicationModuleData(consumingFromApplicationComponent)
    }
}