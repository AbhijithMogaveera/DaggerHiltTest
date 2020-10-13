package com.abhijith.daggerhilttest.di

import com.abhijith.daggerhilttest.di.sampleclass.ServiceComponentData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ServiceComponent
import dagger.hilt.android.scopes.ServiceScoped
import kotlin.random.Random
import kotlin.random.nextInt

@Module
@InstallIn(ServiceComponent::class)
object ServiceComponent {

    @Provides
    @ServiceScoped
    fun begin():ServiceComponentData= ServiceComponentData("Ejecting from----------ServiceComponent #${Random.nextInt(1..10)}")
}