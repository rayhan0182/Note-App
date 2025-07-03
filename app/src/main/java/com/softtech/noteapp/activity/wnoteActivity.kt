package com.softtech.noteapp.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.softtech.noteapp.R
import com.softtech.noteapp.databinding.ActivityWnoteBinding

class wnoteActivity : AppCompatActivity() {
    lateinit var binding: ActivityWnoteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWnoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}