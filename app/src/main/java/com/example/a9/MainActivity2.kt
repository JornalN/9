package com.example.a9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    var to = (0..999).random()
    var randnum = (0..to).random()
    private lateinit var Randtxt: TextView
    private lateinit var RandTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Randtxt = findViewById(R.id.Randtxt)
        RandTextView = findViewById(R.id.RandTextView)

        RandTextView.text= randnum.toString()
        Randtxt.text= getString(R.string.Randtxt,randnum)
    }
}