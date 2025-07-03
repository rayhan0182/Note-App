package com.softtech.noteapp.sqlite

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface userdao {

    @Insert

    fun create(entity: entity)


}