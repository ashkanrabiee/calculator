package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_4 = findViewById<Button>(R.id.btn_4) as Button
        val btn_1 = findViewById<Button>(R.id.btn_1) as Button
        val btn_2 = findViewById<Button>(R.id.btn_2) as Button
        val btn_3 = findViewById<Button>(R.id.btn_3) as Button
        val btn_5 = findViewById<Button>(R.id.btn_5) as Button
        val btn_6 = findViewById<Button>(R.id.btn_6) as Button
        val btn_7 = findViewById<Button>(R.id.btn_7) as Button
        val btn_8 = findViewById<Button>(R.id.btn_8) as Button
        val btn_9 = findViewById<Button>(R.id.btn_9) as Button
        val btn_ac =findViewById<Button>(R.id.btn_ac) as Button

        val restxt = findViewById<TextView>(R.id.restxt) as TextView
        var n1: Int = 0
        var n2: Int = 0

        var temp: Long = 0

        ////////////////////////////////////////////



        btn_1.setOnClickListener {
            temp *= 10 // temp = temp *10
            temp += 1  // temp = temp + 1
            restxt.text = temp.toString()
        }
        btn_2.setOnClickListener {
            temp *= 10  // temp = temp + 10
            temp += 2   // temp = temp + 2
            restxt.text = temp.toString()
        }
        btn_3.setOnClickListener {
            temp *= 10  // temp = temp * 10
            temp += 3   // temp = temp + 3
            restxt.text = temp.toString()
        }

        btn_4.setOnClickListener {
            temp *= 10  // temp = temp * 10
            temp += 4   // temp = temp + 4
            restxt.text = temp.toString()
        }
        btn_5.setOnClickListener {
            temp *= 10  // temp = temp * 10
            temp += 5   // temp = temp + 3
            restxt.text = temp.toString()
        }
        btn_6.setOnClickListener {
            temp *= 10  // temp = temp * 10
            temp += 6   // temp = temp + 6
            restxt.text = temp.toString()
        }
        btn_7.setOnClickListener {
            temp *= 10  // temp = temp * 10
            temp += 7   // temp = temp + 7
            restxt.text = temp.toString()
        }
        btn_8.setOnClickListener {
            temp *= 10  // temp = temp * 10
            temp += 8   // temp = temp + 8
            restxt.text = temp.toString()
        }
        btn_9.setOnClickListener {
            temp *= 10  // temp = temp * 10
            temp += 9   // temp = temp + 9
            restxt.text = temp.toString()
        }
        btn_ac.setOnClickListener {
            temp = 0
            restxt.text = ""
        }


    }
}