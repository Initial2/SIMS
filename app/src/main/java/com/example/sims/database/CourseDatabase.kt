package com.example.sims.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.sims.dao.CourseDao
import com.example.sims.entity.Course


@Database(entities = [Course::class] , version = 1 , exportSchema = false)
abstract class CourseDatabase : RoomDatabase() {
    abstract  fun getCourseDao(): CourseDao
}