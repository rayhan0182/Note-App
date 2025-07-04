package com.softtech.noteapp.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.room.Room
import com.softtech.noteapp.R
import com.softtech.noteapp.databinding.ActivityWnoteBinding
import com.softtech.noteapp.sqlite.dbase
import com.softtech.noteapp.sqlite.entity

class wnoteActivity : AppCompatActivity() {
    lateinit var binding: ActivityWnoteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWnoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.save.setOnClickListener {

            val db = Room.databaseBuilder(
                applicationContext,
                dbase::class.java, "userdata"
            ).allowMainThreadQueries().build()

            val title = binding.title.text.toString()

            val des = binding.des.text.toString()

            val date = binding.date.text.toString()

            val bd = db.userdao()

            val udata = entity(1,title,des,date)

            bd.create(udata)




        }





    }
}