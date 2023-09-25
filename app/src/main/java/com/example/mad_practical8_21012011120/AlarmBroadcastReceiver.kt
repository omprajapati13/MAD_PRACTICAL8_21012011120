package com.example.mad_practical8_21012011120

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadcastReceiver : BroadcastReceiver() {
    companion object{
        val ALARM_KEY="OM"
    val ALARAM_STOP="PRAJAPATI"
    val ALARM_START="SMIT"}
    override fun onReceive(context: Context, intent: Intent) {
        val data=intent.getStringExtra(ALARM_KEY)
        val intentService=Intent(context,AlarmService::class.java)
        if (data == ALARM_START){
            context.startService(intentService)
        }
        else if (data== ALARAM_STOP)
        {
            context.stopService(intentService)
        }
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.

    }
}