package com.softtech.noteapp.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.softtech.noteapp.R
import com.softtech.noteapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.click.setOnClickListener {

            val intent = Intent(this@MainActivity, wnoteActivity::class.java)

            startActivity(intent)

        }




    }
}