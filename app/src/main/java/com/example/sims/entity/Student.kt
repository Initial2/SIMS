package com.example.sims.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "student")
data class Student(
        @PrimaryKey
        var student_id:Int?,

        @ColumnInfo(name = "name")
        var name: String?,

        @ColumnInfo(name = "age")
        var age: String?,

        @ColumnInfo(name = "sex")
        var sex: String?,

        @ColumnInfo(name = "tel")
        var tel: String?,

        @ColumnInfo(name = "address")
        var address: String?


) {
    override fun toString(): String {
        return "Student(student_id=$student_id, name=$name, age=$age, sex=$sex, tel=$tel, address=$address)"
    }
}
