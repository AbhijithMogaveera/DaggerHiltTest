package com.abhijith.daggerhilttest.module

import com.abhijith.daggerhilttest.consumingFromFragmentComponent
import com.abhijith.daggerhilttest.module.data.FragmentModuleData
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
    fun begin():FragmentModuleData= FragmentModuleData(consumingFromFragmentComponent)
}