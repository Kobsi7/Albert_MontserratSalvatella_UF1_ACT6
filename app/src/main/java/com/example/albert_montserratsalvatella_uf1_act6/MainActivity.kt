package com.example.albert_montserratsalvatella_uf1_act6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.textInputEditText)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            val texto = editText.text.toString()
            Toast.makeText(applicationContext, texto, Toast.LENGTH_SHORT).show()
        }

    }
}