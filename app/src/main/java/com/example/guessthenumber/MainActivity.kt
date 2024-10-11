package com.example.guessthenumber

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val et_num = findViewById<EditText>(R.id.et_num)
        val tv_result = findViewById<TextView>(R.id.tv_result)

        val btn_guess = findViewById<Button>(R.id.bt_guess)
        val btn_reset = findViewById<Button>(R.id.bt_reset)

        val tv_attempts = findViewById<TextView>(R.id.tv_attemps)
        val tv_prev = findViewById<TextView>(R.id.tv_prevguess)

        var number = Random.nextInt(1, 100)
        var attempts = 0

        btn_guess.setOnClickListener() {
            val guess_num = et_num.text.toString().toIntOrNull()
            val result: String
            val prev: String

            if (guess_num == null || guess_num < 1 || guess_num > 100) {
                prev = tv_prev.text.toString()
                result = "Error, enter a valid number between 1 and 100"
            } else if (guess_num == number) {
                prev = "The number was $guess_num"
                result = "Correct!"
                attempts++;
            } else if (guess_num < number) {
                prev = "Previous guess: $guess_num"
                result = "The number is higher. Try again!"
                attempts++;
            } else {
                prev = "Previous guess: $guess_num"
                result = "The number is lower. Try again!"
                attempts++;
            }

            tv_result.text = result
            tv_attempts.text = "Attempts: $attempts"
            tv_prev.text = prev

            et_num.text.clear()

        }

        btn_reset.setOnClickListener() {
            number = Random.nextInt(1, 100)
            tv_result.text = ""
            et_num.text.clear()

            attempts = 0
            tv_attempts.text = "Attempts: $attempts"

            tv_prev.text = "Previous guess:"
        }
    }
}