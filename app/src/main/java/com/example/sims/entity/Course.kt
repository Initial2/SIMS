package com.example.sims.entity

import androidx.room.ColumnInfo
import androidx.room.Entity


@Entity(primaryKeys = ["teacher_id","course_id"],tableName = "Course")
data class Course(

    var teacher_id: Int,
    var course_id: Int,

) {
    override fun toString(): String {
        return "Course(teacher_id=$teacher_id, course_id=$course_id)"
    }
}
