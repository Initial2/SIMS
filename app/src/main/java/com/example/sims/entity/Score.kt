package com.example.sims.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(primaryKeys = ["student_id", "course"],tableName = "score")
data class Score(
        @NonNull()
        var student_id:Int,
        @NonNull
        var course:Int,
        @ColumnInfo(name = "score")
        var score:Int?
) {
    override fun toString(): String {
        return "Score(student_id=$student_id, course=$course, score=$score)"
    }
}
