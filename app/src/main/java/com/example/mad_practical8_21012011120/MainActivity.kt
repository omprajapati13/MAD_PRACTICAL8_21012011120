package com.example.mad_practical8_21012011120

import android.app.AlarmManager
import android.app.PendingIntent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun setalaram(minitime:Long,action:String){
        val intentalaram=Intent(applicationContext,AlarmBroadcastReceiver::class.java)
        intentalaram.putextra(AlarmBroadcastReceiver)
        val pandingintent=PendingIntent.getBroadcast(applicationContext,2001,intentalaram,pendingIntent.FL)
        val manager=getSystemService(ALARM_SERVICE as AlarmManager)
        if (action==AlarmBroadcastReceiver.ALARM_START){
            manager.setExact(AlarmManager.)
        }
    }
}