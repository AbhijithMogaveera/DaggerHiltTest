package com.abhijith.daggerhilttest.di

import com.abhijith.daggerhilttest.di.sampleclass.ApplicationModuleData
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
    fun begin():ApplicationModuleData= ApplicationModuleData("Ejecting from----------ApplicationComponent #${Random.nextInt(1..10)}")
}