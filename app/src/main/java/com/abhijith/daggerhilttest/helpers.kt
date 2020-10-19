package com.abhijith.daggerhilttest

import kotlin.random.Random
import kotlin.random.nextInt

val randomInt
        get() = Random.nextInt(1..10)

const val notificationID = 101
const val notificationReqID = 102
const val notificationName = "nn"
val consumingFromActivityComponent
        = "Consuming from ---ActivityComponent           #${Random.nextInt(1..10)}"
val consumingFromFragmentComponent
        = "Consuming from ---FragmentComponent           #${Random.nextInt(1..10)}"
val consumingFromServiceComponent
        = "Consuming from ---ServiceComponent            #${Random.nextInt(1..10)}"
val consumingFromViewComponent
        = "Consuming from ---ViewComponent               #${Random.nextInt(1..10)}"
val consumingFromViewWithFragmentComponent
        = "Consuming from ---ViewWithFragmentComponent   #${Random.nextInt(1..10)}"
val consumingFromCustomComponent
        = "Consuming from ---Custom component            #${Random.nextInt(1..10)}"
val consumingFromApplicationComponent
        = "Consuming from ---ApplicationComponent        #${Random.nextInt(1..10)}"
val consumingFromActivityRetainedModule
        = "Consuming from ---ActivityRetainedComponent   #${Random.nextInt(1..10)}"
const val startService
        = "Start service"
const val stopService
        = "Stop service"
const val activity
        = "Activity"