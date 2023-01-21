package com.example.financer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_page2.*

class MainPage2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page2)
        var counter = intent.getIntExtra("turn",0)
        var choice = 0
        var choice1 = intent.getIntExtra("choice1",0)
        var amount1 = intent.getIntExtra("amount1",0)
        var choice2 = intent.getIntExtra("choice2",0)
        var amount2 = intent.getIntExtra("amount2",0)
        var choice3 = intent.getIntExtra("choice3",0)
        var amount3 = intent.getIntExtra("amount3",0)
        var money = intent.getIntExtra("money",0)
        var ar1 = intent.getBooleanExtra("ar1", false)
        var ar2 = intent.getBooleanExtra("ar1", false)
        var ar3 = intent.getBooleanExtra("ar1", false)

        netflix.setOnClickListener {
            choice = 1
            personal.isEnabled = false
            hospital.isEnabled = false
            clear.isEnabled = true
        }
        personal.setOnClickListener {
            choice = 2
            netflix.isEnabled = false
            hospital.isEnabled = false
            clear.isEnabled = true
        }
        hospital.setOnClickListener {
            choice = 3
            netflix.isEnabled = false
            personal.isEnabled = false
            clear.isEnabled = true
        }
        clear.setOnClickListener(){
            choice = 0
            netflix.isEnabled = true
            personal.isEnabled = true
            hospital.isEnabled = true
        }
        okBtn.setOnClickListener {
            var amount = amountEntered.text.toString().toInt()
            if (amount > 0){
                if (money >= amount){
                    if (choice > 0){
                        val intent = Intent(this,MainPage1::class.java)
                        intent.putExtra("turn",counter + 1)
                        counter++
                        if (counter == 1){
                            amount1 = amount
                            choice1 = choice
                            intent.putExtra("choice1",choice1)
                            intent.putExtra("amount1",amount1)
                            intent.putExtra("ar1",ar1)
                        }
                        else if (counter == 2){
                            amount2 = amount
                            choice2 = choice
                            intent.putExtra("choice1",choice1)
                            intent.putExtra("amount1",amount1)
                            intent.putExtra("choice2",choice2)
                            intent.putExtra("amount2",amount2)
                            intent.putExtra("ar1",ar1)
                            intent.putExtra("ar2",ar2)
                        }
                        else if (counter == 3){
                            amount3 = amount
                            choice3 = choice
                            intent.putExtra("choice1",choice1)
                            intent.putExtra("amount1",amount1)
                            intent.putExtra("choice2",choice2)
                            intent.putExtra("amount2",amount2)
                            intent.putExtra("choice3",choice3)
                            intent.putExtra("amount3",amount3)
                            intent.putExtra("ar1",ar1)
                            intent.putExtra("ar2",ar2)
                            intent.putExtra("ar3",ar3)
                        }
                        intent.putExtra("money",money)
                        startActivity(intent)
                    }
                    else{
                        Toast.makeText(this, "You must select at least one button", Toast.LENGTH_SHORT).show()
                    }
                }
                else{
                    Toast.makeText(this, "The amount you entered is higher the amount you have in your account", Toast.LENGTH_SHORT).show()
                }
            }
            else{
                Toast.makeText(this, "Amount cannot be zero! or empty", Toast.LENGTH_SHORT).show()
            }
        }
    }
}