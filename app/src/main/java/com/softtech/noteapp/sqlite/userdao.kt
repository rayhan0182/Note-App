package com.softtech.noteapp.sqlite

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface userdao {

    @Insert
    fun create(entity: entity)

    @Query("SELECT * FROM entity")

    fun getall(): List<entity>



}