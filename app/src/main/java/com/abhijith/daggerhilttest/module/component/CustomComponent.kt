package com.abhijith.daggerhilttest.module.component

import android.content.Context
import com.abhijith.daggerhilttest.DummyComponentAccess
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Subcomponent
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Inject
import javax.inject.Singleton

//-----------------------one------------------

@Singleton
@Component(modules = [AppSubcomponents::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun build(@BindsInstance context: Context): AppComponent
    }

    fun dummyComponent(): DummyComponent.Factory
}

//---------------------two--------------------

@Module(subcomponents = [DummyComponent::class])
@InstallIn(ApplicationComponent::class)
interface AppSubcomponents

//---------------------three--------------------

@CustomScope
@Subcomponent
interface DummyComponent {

    @Subcomponent.Factory
    interface Factory {
        fun build(): DummyComponent
    }

    fun inject(cls: DummyComponentAccess)
}

//-------------------four------------------------

class DummyData @Inject constructor(context: Context) {
    fun getMessage(): String = "Hello custom component"
}