package com.example.sims.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.sims.dao.ScoreDao
import com.example.sims.entity.Score

@Database(entities = [Score::class] , version = 1 , exportSchema = false)
abstract class ScoreDatabase : RoomDatabase() {
        abstract fun getScoreDao(): ScoreDao
}