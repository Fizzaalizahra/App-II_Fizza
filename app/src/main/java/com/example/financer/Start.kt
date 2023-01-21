package com.example.financer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start.*

class Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        arrow.setOnClickListener(){
            val intent = Intent(this,MoneyInput::class.java)
            startActivity(intent)
        }
    }
}