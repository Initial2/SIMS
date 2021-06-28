package com.example.sims.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.sims.dao.StudentDao
import com.example.sims.entity.Student

@Database(entities = [Student::class] , version = 1 , exportSchema = false)
abstract class StudentDatabase : RoomDatabase() {
    abstract fun getStudentDao(): StudentDao
}