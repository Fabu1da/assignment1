package com.example.myfirstapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

private const val Receiver = "MyReceiver"
class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        //  TODO("MyReceiver.onReceive() is not implemented")
        Toast.makeText(context, "My receiver manifest broadcast", Toast.LENGTH_LONG).show()
    }
}