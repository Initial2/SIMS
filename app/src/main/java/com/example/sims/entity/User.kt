package com.example.sims.entity

import androidx.room.*

@Entity(tableName = "user")
data class User (
    @PrimaryKey(autoGenerate = true)
    var user_id: Int?,

    @ColumnInfo(name = "username")
    var username: String?,

    @ColumnInfo(name = "password")
    var password: String?,

    @ColumnInfo(name = "access_level")
    var access_level: Int?


) {
    override fun toString(): String {
        return "User(user_id=$user_id, username=$username, password=$password, access_level=$access_level)"
    }
}