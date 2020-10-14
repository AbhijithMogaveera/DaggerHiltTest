package com.abhijith.daggerhilttest.di

import com.abhijith.daggerhilttest.di.sampleclass.ServiceModuleData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ServiceComponent
import dagger.hilt.android.scopes.ServiceScoped
import kotlin.random.Random
import kotlin.random.nextInt

@Module
@InstallIn(ServiceComponent::class)
object ServiceModule {

    @Provides
    @ServiceScoped
    fun begin():ServiceModuleData= ServiceModuleData("Ejecting from----------ServiceComponent #${Random.nextInt(1..10)}")
}