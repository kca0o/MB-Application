package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NewRecipeAcitiity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_new_recipe_acitiity)



        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        val etName: EditText = findViewById(R.id.etName)
        val btnSave: Button = findViewById(R.id.btnSave)
        btnSave.setOnClickListener {
            val name = etName.text.toString()

            if (name.isBlank()){
                // Toast simple messsage that fading away instead of error that user have to press okay
                //show validation non blokcing
                Toast.makeText(this, "Recipe name is required", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}