package com.example.mad_practical8_21012011120

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun setalaram(minitime: Long, action: String) {
        val intentAlarm = Intent(applicationContext, AlarmBroadcastReceiver::class.java)
        intentAlarm.putExtra(AlarmBroadcastReceiver.ALARM_KEY, action)
        val pendingIntent = PendingIntent.getBroadcast(
            applicationContext,
            2345,
            intentAlarm,
            PendingIntent.FLAG_UPDATE_CURRENT
        )
        val manager = getSystemService(ALARM_SERVICE) as AlarmManager
        if (action == AlarmBroadcastReceiver.ALARM_START) {
            manager.setExact(AlarmManager.RTC_WAKEUP, minitime, pendingIntent)
        }
    }
}