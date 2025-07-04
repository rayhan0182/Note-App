package com.softtech.noteapp.sqlite

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class entity(

    @PrimaryKey(autoGenerate = true)

    val id: Int,

    val tname: String,

    val date: String,

    val des: String
)
