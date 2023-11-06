package com.example.baituan1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity

class MainActivity : ComponentActivity() {
    class MainActivity2 : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            Log.e(STATE, "onCreate")
        }

        fun openSecondActivity(view: View?) {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        override fun onStart() {
            super.onStart()
            Log.e(STATE, "onPause")
        }

        override fun onStop() {
            super.onStop()
            Log.e(STATE, "onStop")
        }

        override fun onResume() {
            super.onResume()
            Log.e(STATE, "onResume")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.e(STATE, "onDestroy")
        }

        companion object {
            private const val STATE = "Trang thai"
        }
    }
}