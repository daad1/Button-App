package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var number = 0
    private lateinit var numberText : TextView
    private lateinit var minusBtn : Button
    private  lateinit var plusBtn : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberText = findViewById(R.id.number)
        minusBtn = findViewById(R.id.Minus)
        plusBtn = findViewById(R.id.plus)

        minusBtn.setOnClickListener{
            updateNumber(false)
        }

        plusBtn.setOnClickListener {
            updateNumber(true)

        }
    }
    private fun updateNumber(add: Boolean){
        if (add) {
            number ++
        }
        else {
            number --
        }
        numberText.text = number.toString()
    }
}