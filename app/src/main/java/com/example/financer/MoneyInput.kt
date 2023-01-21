package com.example.financer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_money_input.*

class MoneyInput : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_money_input)
        next.setOnClickListener(){
            val intent = Intent(this,MainPage1::class.java)
            val moneyVar = money.text.toString().toInt()
            if (moneyVar > 0){
                intent.putExtra("money",money.text.toString().toInt())
                startActivity(intent)
            }
        }
    }
}