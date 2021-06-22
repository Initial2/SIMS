package com.example.sims.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.sims.dao.UserDao
import com.example.sims.entity.User


@Database(entities = [User::class],version = 1,exportSchema = false)
abstract class UserDatabase : RoomDatabase() {
    abstract fun getUserDao(): UserDao
}