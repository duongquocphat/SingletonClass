package com.shakutara.singletonclassdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val singletonClass1 = SingletonClass.getInstance()
        val singletonClass2 = SingletonClass.getInstance()

        Log.d("SingletonClass1", "${singletonClass1.hashCode()}")
        Log.d("SingletonClass2", "${singletonClass2.hashCode()}")
    }
}
