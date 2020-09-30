package com.example.introduccionandroi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v(MainActivity::class.java.name, msg:"Este es un log v")
        Log.d(MainActivity::class.java.name, msg:"Este es un log d de debugger")
        Log.i(MainActivity::class.java.name, msg:"Este es un log i information")
        Log.w(MainActivity::class.java.name, msg:"Este es un log w warning")
        Log.e(MainActivity::class.java.name, msg:"Este es un log e error")

            var hola = getString(R.string.hello)
    }
}
