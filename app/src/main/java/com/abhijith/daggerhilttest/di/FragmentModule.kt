package com.abhijith.daggerhilttest.di

import com.abhijith.daggerhilttest.di.sampleclass.FragmentModuleData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped
import kotlin.random.Random
import kotlin.random.nextInt

@Module
@InstallIn(FragmentComponent::class)
class FragmentModule {

    @FragmentScoped
    @Provides
    fun begin():FragmentModuleData= FragmentModuleData("Ejecting from----------FragmentComponent #${Random.nextInt(1..10)}")
}