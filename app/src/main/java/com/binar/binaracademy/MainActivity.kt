package com.binar.binaracademy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.binar.binaracademy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            Toast.makeText(applicationContext, "This is my Toast message!",
                Toast.LENGTH_LONG).show()
        }

        binding.imageView.setOnClickListener{
            val intent = Intent(this, CH2::class.java)
            startActivity(intent)
        }
    }
}