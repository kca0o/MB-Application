package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd: ImageButton = findViewById(R.id.btnAdd)
        btnAdd.setOnClickListener {
            val intent = Intent(this, NewRecipeAcitiity::class.java)
            startActivity(intent)
        }
    }
}
