package com.abhijith.daggerhilttest.di

import com.abhijith.daggerhilttest.di.sampleclass.ViewComponentData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewComponent
import dagger.hilt.android.scopes.ViewScoped
import kotlin.random.Random
import kotlin.random.nextInt

@Module
@InstallIn(ViewComponent::class)
class _ViewComponent{
    @Provides
    @ViewScoped
    fun begin() = ViewComponentData("Ejecting from----------ViewComponentData #${Random.nextInt(1..10)}")
}