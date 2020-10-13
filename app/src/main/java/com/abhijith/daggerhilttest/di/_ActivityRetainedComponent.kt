package com.abhijith.daggerhilttest.di

import com.abhijith.daggerhilttest.di.sampleclass.ActivityRetainedComponentData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlin.random.Random
import kotlin.random.nextInt

@Module
@InstallIn(ActivityRetainedComponent::class)
object _ActivityRetainedComponent {

    @Provides
    @ActivityRetainedScoped
    fun begin():ActivityRetainedComponentData
            = ActivityRetainedComponentData("Ejecting from----------ActivityRetainedComponent #${Random.nextInt(1..10)}")
}