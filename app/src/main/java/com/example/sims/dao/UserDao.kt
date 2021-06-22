package com.example.sims.dao

import androidx.room.*
import com.example.sims.entity.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(element:User)

    @Query("select * from user")
    fun getAllStudents():MutableList<User>

    @Query("select * from user where user_id = :user_id")
    fun getStudnet(user_id:String):User

    @Query("select * from user order by user_id desc ")
    fun getAllByDateDesc():MutableList<User>

    @Query("delete from User")
    fun deleteAll()

    @Query("select access_level from user where username = :username and password = :password")
    fun login(username :String , password :String):Int

}