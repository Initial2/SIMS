package com.example.sims.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.sims.entity.Student

@Dao
interface StudentDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(element: Student)

    @Query("select * from student where student_id = :student_id")
    fun show(student_id:Int):Student


}