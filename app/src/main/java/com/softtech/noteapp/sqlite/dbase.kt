package com.softtech.noteapp.sqlite

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities =[entity::class], version = 1)
abstract  class dbase: RoomDatabase() {

   abstract fun userdao():userdao

}