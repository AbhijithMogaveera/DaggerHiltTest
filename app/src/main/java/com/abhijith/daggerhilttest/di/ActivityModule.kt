package com.abhijith.daggerhilttest.di

import com.abhijith.daggerhilttest.di.sampleclass.ActivityModuleData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import kotlin.random.Random
import kotlin.random.nextInt

@Module
@InstallIn(ActivityComponent::class)
object ActivityModule {

    @Provides
    @ActivityScoped
    fun begin():ActivityModuleData = ActivityModuleData("Ejecting from----------ActivityComponent #${Random.nextInt(1..10)}")
}