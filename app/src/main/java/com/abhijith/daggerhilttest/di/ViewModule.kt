package com.abhijith.daggerhilttest.di

import com.abhijith.daggerhilttest.di.sampleclass.ViewModuleData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewComponent
import dagger.hilt.android.scopes.ViewScoped
import kotlin.random.Random
import kotlin.random.nextInt

@Module
@InstallIn(ViewComponent::class)
class ViewModule{
    @Provides
    @ViewScoped
    fun begin() = ViewModuleData("Ejecting from----------ViewComponentData #${Random.nextInt(1..10)}")
}