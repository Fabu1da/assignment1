package com.example.myfirstapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //val receiver1 : BroadcastReceiver = MyReceiver()
    lateinit var receiver: BroadcastReceiver
    lateinit var context: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this
        
//        context registered Receiver 
        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_POWER_CONNECTED)
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED)

        receiver = object: BroadcastReceiver(){
            override fun onReceive(context: Context?, intent: Intent?) {
                Toast.makeText(context, intent?.action, Toast.LENGTH_LONG).show()
            }

        }
        registerReceiver(receiver, filter)

    }

    override fun onDestroy() {
        unregisterReceiver(receiver)
        super.onDestroy()
    }

    fun createToast(view : View){
        val toast = Toast.makeText(applicationContext,"This is a testing message for the button", Toast.LENGTH_SHORT)
        toast.show()
    }

    fun nextPagebtn(view: View){
        val inputName = findViewById<EditText>(R.id.Names)
        val names = inputName.text.toString()
        val intent = Intent(this, NextPage::class.java).apply {
            val message = Toast.makeText(applicationContext, "wagwan broh", Toast.LENGTH_SHORT)
            message.show()
            putExtra("names",names)
        }
        startActivity(intent)
    }
    //manifest registerd receiver
    fun sendBroadcast(view: View){
        sendBroadcast(Intent(context, MyReceiver::class.java))
    }


}