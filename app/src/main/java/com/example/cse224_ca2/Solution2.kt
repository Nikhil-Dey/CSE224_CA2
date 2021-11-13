package com.example.cse224_ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class Solution2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solution2)

        val button: Button = findViewById(R.id.button1)
        button.setOnClickListener{
            val toast = Toast.makeText(this, "Button is Clicked", Toast.LENGTH_SHORT)
            toast.show()
        }

        val radio: RadioButton = findViewById(R.id.radio)
        radio.setOnClickListener{
            val toast = Toast.makeText(this, "radio button is Clicked", Toast.LENGTH_SHORT)
            toast.show()
        }

        val check: CheckBox = findViewById(R.id.checkbox)
        check.setOnClickListener{
            if(check.isChecked){
                val toast = Toast.makeText(this, "check button is checked", Toast.LENGTH_SHORT)
                toast.show()
            }else{
                val toast = Toast.makeText(this, "check button is unchecked", Toast.LENGTH_SHORT)
                toast.show()
            }
        }
    }
}