package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btn: Button
    private lateinit var tv: TextView
    private var counter = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        tv = findViewById(R.id.textView)
        counter = savedInstanceState?.getInt(KEY) ?: 0
        tv.text = counter.toString()
        // Pattern MVVM
        btn.setOnClickListener {
            counter++
            tv.text = counter.toString()
        }
        Log.d("RRR","onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(KEY, counter)
    }

    override fun onStart() {
        super.onStart()
        Log.d("RRR","onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("RRR","onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d("RRR","onResume")
    }

    override fun onDestroy() {
        Log.d("RRR","onDestroy")
        super.onDestroy()
    }

    override fun onStop() {
        super.onStop()
        Log.d("RRR","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("RRR","onRestart")
    }

    companion object {
        val KEY = "key"
    }
}