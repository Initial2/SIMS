package com.example.sims.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.sims.entity.Score

@Dao
interface ScoreDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(element: Score)

    @Query("select score from Score where student_id = :student_id and course = :course")
    fun select(student_id:Int,course:String): Int
}