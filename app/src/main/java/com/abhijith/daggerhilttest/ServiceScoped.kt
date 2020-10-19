package com.abhijith.daggerhilttest

import android.annotation.SuppressLint
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.lifecycle.LifecycleService
import com.abhijith.daggerhilttest.module.data.ApplicationModuleData
import com.abhijith.daggerhilttest.module.data.ServiceModuleData
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ServiceScoped : Service() {

    val NOT_USED = 101

    @Inject
    lateinit var scd: ServiceModuleData;

    @Inject
    lateinit var acd: ApplicationModuleData

    @SuppressLint("LogNotTimber")

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        val emptyIntent = Intent(notificationName)

        val pendingIntent = PendingIntent.getBroadcast(
            applicationContext,
            NOT_USED,
            emptyIntent,
            PendingIntent.FLAG_UPDATE_CURRENT
        )

        val mBuilder: NotificationCompat.Builder =
            NotificationCompat.Builder(this).apply{
                setSmallIcon(R.drawable.ic_launcher_foreground)
                setContentTitle(scd.from)
                setContentText(acd.from)
                setContentIntent(pendingIntent)
            }
        getNotificationManager().notify(notificationID, mBuilder.build())
        onDestroy()
        return super.onStartCommand(intent, flags, startId)
    }
}
fun  Context.getNotificationManager():NotificationManager{
    return getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
}