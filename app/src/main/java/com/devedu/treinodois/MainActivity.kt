package com.devedu.treinodois

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
           val firstName = name.text.toString()
           val lastName = last.text.toString()
           val birthDate = Birth.text.toString()
            val country = country.text.toString()
            printview.text = "hello $firstName $lastName born on $birthDate in $country, if you are ready to count press the button COUNT"
           }

        var count = 0
        btncalculate.setOnClickListener {
            count++
            calculate.text = "We are on $count"
        }
        }
    }
