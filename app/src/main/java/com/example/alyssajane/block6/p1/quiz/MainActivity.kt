package com.example.alyssajane.block6.p1.quiz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener  {

    lateinit var addition : Button
    lateinit var subtraction : Button
    lateinit var etone : EditText
    lateinit var ettwo : EditText
    lateinit var resu : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addition = findViewById(R.id.add)
        subtraction = findViewById(R.id.sub)
        etone = findViewById(R.id.et1)
        ettwo = findViewById(R.id.et2)
        resu = findViewById(R.id.res)

        addition.setOnClickListener(this)
        subtraction.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a = etone.text.toString().toDouble()
        var b = ettwo.text.toString().toDouble()
        var result = 0.0

        when(v?.id){
            R.id.add ->{
                result= a+b
            }
            R.id.sub ->{
                result= a-b
            }
        }
        resu.text = "$result"
    }


}