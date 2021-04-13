package com.sogrey.math3.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sogrey.math3.Vector2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var vec2 =  Vector2()

        vec2.x = 10
    }
}