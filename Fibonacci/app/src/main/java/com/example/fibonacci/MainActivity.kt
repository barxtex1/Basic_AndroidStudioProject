package com.example.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val ann: MutableList<Int> = mutableListOf(2)
    val a0: MutableList<Int> = mutableListOf(1)
    val a1: MutableList<Int> = mutableListOf(1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countUp: Button = findViewById(R.id.count_up)
        val countDown: Button = findViewById(R.id.count_down)

        countUp.setOnClickListener {
            counter_up()
        }
        countDown.setOnClickListener {
            counter_down()
        }
    }

    private fun counter_up() {
        val ann_: TextView = findViewById(R.id.ann)
        val a0_: TextView = findViewById(R.id.a0)
        val a1_: TextView = findViewById(R.id.a1)
        val number_a0 = a0_.text.toString().toInt()
        val number_a1 = a1_.text.toString().toInt()
        val sum = number_a0 + number_a1
        ann.add(ann_.text.toString().toInt())
        a0.add(number_a0)
        a1.add(number_a1)
        a1_.setText(ann_.text)
        a0_.setText(number_a1.toString())
        ann_.setText(sum.toString())

    }

    private fun counter_down() {
        val ann_: TextView = findViewById(R.id.ann)
        val a0_: TextView = findViewById(R.id.a0)
        val a1_: TextView = findViewById(R.id.a1)
        if (ann.size > 1) {
            ann_.setText(ann.get(ann.lastIndex).toString())
            a0_.setText(a0.get(a0.lastIndex).toString())
            a1_.setText(a1.get(a1.lastIndex).toString())
            ann.removeLast()
            a0.removeLast()
            a1.removeLast()
        }
    }
}