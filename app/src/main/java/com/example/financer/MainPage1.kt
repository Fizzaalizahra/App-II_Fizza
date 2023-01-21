package com.example.financer

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_page1.*

@Suppress("KotlinConstantConditions")
class MainPage1 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page1)
        var money = intent.getIntExtra("money",0)
        val choice1 = intent.getIntExtra("choice1",0)
        val amount1 = intent.getIntExtra("amount1",0)
        val choice2 = intent.getIntExtra("choice2",0)
        val amount2 = intent.getIntExtra("amount2",0)
        val choice3 = intent.getIntExtra("choice3",0)
        val amount3 = intent.getIntExtra("amount3",0)
        val turn = intent.getIntExtra("turn",0)
        var enoughMoney = true

        if (money <= 0){
            enoughMoney = false
        }

        info.setOnClickListener(){
            val myDialoug = Dialog(this)
            myDialoug.setContentView(R.layout.popup)
            myDialoug.setCancelable(true)
            myDialoug.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialoug.show()
        }

        newExpense.setOnClickListener {
           if (enoughMoney){
               if (turn < 3){
                   val intent = Intent(this,MainPage2::class.java)
                   intent.putExtra("turn",turn)
                   when (turn) {
                       1 -> {
                           intent.putExtra("choice1",choice1)
                           intent.putExtra("amount1",amount1)
                       }
                       2 -> {
                           intent.putExtra("choice1",choice1)
                           intent.putExtra("amount1",amount1)
                           intent.putExtra("choice2",choice2)
                           intent.putExtra("amount2",amount2)
                       }
                       3 -> {
                           intent.putExtra("choice1",choice1)
                           intent.putExtra("amount1",amount1)
                           intent.putExtra("choice2",choice2)
                           intent.putExtra("amount2",amount2)
                           intent.putExtra("choice3",choice3)
                           intent.putExtra("amount3",amount3)
                       }
                   }
                   intent.putExtra("money",money)
                   startActivity(intent)
               }
               else{
                   Toast.makeText(this, "You are at expense limit!", Toast.LENGTH_SHORT).show()
               }
           }
           else{
               Toast.makeText(this, "You don't have enough money", Toast.LENGTH_SHORT).show()

           }
        }

        when (turn) {
            1 -> {
                money -= amount1
                when (choice1) {
                    1 -> {
                        bg1.setImageResource(R.drawable.bg)
                        logo1.setImageResource(R.drawable.netflix)
                        logo1txt.text = "Netflix"
                        am1.text = "$amount1 AED"
                    }
                    2 -> {
                        bg1.setImageResource(R.drawable.bg)
                        logo1.setImageResource(R.drawable.personal)
                        logo1txt.text = "Personal"
                        am1.text = "$amount1 AED"
                    }
                    3 -> {
                        bg1.setImageResource(R.drawable.bg)
                        logo1.setImageResource(R.drawable.hospital)
                        logo1txt.text = "Hospital"
                        am1.text = "$amount1 AED"
                    }
                }
            }
            2 -> {
                money -= amount2
                when (choice1) {
                    1 -> {
                        bg1.setImageResource(R.drawable.bg)
                        logo1.setImageResource(R.drawable.netflix)
                        logo1txt.text = "Netflix"
                        am1.text = "$amount1 AED"
                    }
                    2 -> {
                        bg1.setImageResource(R.drawable.bg)
                        logo1.setImageResource(R.drawable.personal)
                        logo1txt.text = "Personal"
                        am1.text = "$amount1 AED"
                    }
                    3 -> {
                        bg1.setImageResource(R.drawable.bg)
                        logo1.setImageResource(R.drawable.hospital)
                        logo1txt.text = "Hospital"
                        am1.text = "$amount1 AED"
                    }
                }
                when (choice2) {
                    1 -> {
                        bg2.setImageResource(R.drawable.bg)
                        logo2.setImageResource(R.drawable.netflix)
                        logo2txt.text = "Netflix"
                        am2.text = "$amount2 AED"
                    }
                    2 -> {
                        bg2.setImageResource(R.drawable.bg)
                        logo2.setImageResource(R.drawable.personal)
                        logo2txt.text = "Personal"
                        am2.text = "$amount2 AED"
                    }
                    3 -> {
                        bg2.setImageResource(R.drawable.bg)
                        logo2.setImageResource(R.drawable.hospital)
                        logo2txt.text = "Hospital"
                        am2.text = "$amount2 AED"
                    }
                }
            }
            3 -> {
                money -= amount3
                if (choice1 == 1){
                    bg1.setImageResource(R.drawable.bg)
                    logo1.setImageResource(R.drawable.netflix)
                    logo1txt.text = "Netflix"
                    am1.text = "$amount1 AED"
                }
                else if (choice1 == 2){
                    bg1.setImageResource(R.drawable.bg)
                    logo1.setImageResource(R.drawable.personal)
                    logo1txt.text = "Personal"
                    am1.text = "$amount1 AED"
                }
                else if(choice2 == 3){
                    bg1.setImageResource(R.drawable.bg)
                    logo1.setImageResource(R.drawable.hospital)
                    logo1txt.text = "Hospital"
                    am1.text = "$amount1 AED"
                }
                when (choice2) {
                    1 -> {
                        bg2.setImageResource(R.drawable.bg)
                        logo2.setImageResource(R.drawable.netflix)
                        logo2txt.text = "Netflix"
                        am2.text = "$amount2 AED"
                    }
                    2 -> {
                        bg2.setImageResource(R.drawable.bg)
                        logo2.setImageResource(R.drawable.personal)
                        logo2txt.text = "Personal"
                        am2.text = "$amount2 AED"
                    }
                    3 -> {
                        bg2.setImageResource(R.drawable.bg)
                        logo2.setImageResource(R.drawable.hospital)
                        logo2txt.text = "Hospital"
                        am2.text = "$amount2 AED"
                    }
                }
                when (choice3) {
                    1 -> {
                        bg3.setImageResource(R.drawable.bg)
                        logo3.setImageResource(R.drawable.netflix)
                        logo3txt.text = "Netflix"
                        am3.text = "$amount3 AED"
                    }
                    2 -> {
                        bg3.setImageResource(R.drawable.bg)
                        logo3.setImageResource(R.drawable.personal)
                        logo3txt.text = "Personal"
                        am3.text = "$amount3 AED"
                    }
                    3 -> {
                        bg3.setImageResource(R.drawable.bg)
                        logo3.setImageResource(R.drawable.hospital)
                        logo3txt.text = "Hospital"
                        am3.text = "$amount3 AED"
                    }
                }
            }
        }
        balance.text = "Account Balance: $money"
    }
}