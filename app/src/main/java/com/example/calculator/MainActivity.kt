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
        val btn_ac = findViewById<Button>(R.id.btn_ac) as Button
        val btn_multy = findViewById<Button>(R.id.btn_multy) as Button
        val btn_plus = findViewById<Button>(R.id.btn_plus) as Button
        val btn_negetive = findViewById<Button>(R.id.btn_negetive) as Button
        val btn_mosavi = findViewById<Button>(R.id.btn_mosavi) as Button
        val btn_tagsim = findViewById<Button>(R.id.btn_tagsim) as Button
        val btn_zero = findViewById<Button>(R.id.btn_zero) as Button

        val restxt = findViewById<TextView>(R.id.restxt) as TextView
        var n1: Int = 0
        var n2: Int = 0
        var op = ""
        var temp: Long = 0

        ////////////////////////////////////////////
        btn_zero.setOnClickListener {
            temp *= 10 // temp = temp *10
            temp += 0  // temp = temp + 1
            restxt.text = temp.toString()
        }

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
        btn_plus.setOnClickListener {
            n1 = restxt.text.toString().toInt()
            op = "+"
            restxt.text = ""
            temp = 0

        }

        btn_negetive.setOnClickListener {
            n1 = restxt.text.toString().toInt()
            op = "-"
            restxt.text = ""
            temp = 0
        }
        btn_multy.setOnClickListener {
            n1 = restxt.text.toString().toInt()
            op = "*"
            restxt.text = ""
            temp = 0
        }
        btn_tagsim.setOnClickListener {
            n1 = restxt.text.toString().toInt()
            op = "/"
            restxt.text = ""
            temp = 0
        }
        btn_mosavi.setOnClickListener {

            n2 = restxt.text.toString().toInt()
            if (op == "+") {
                restxt.text = (n1 + n2).toString()
            }



        if (op == "-") {
            restxt.text = (n1 - n2).toString()
        }
        if (op == "*") {
            restxt.text = (n1 * n2).toString()
        }
        if(op == "/"){
            restxt.text =(n1/n2).toString()
        }
        }
    }
}