package com.example.sims.login

import android.content.Context
import androidx.room.Room
import com.example.sims.dao.UserDao
import com.example.sims.database.UserDatabase
import com.example.sims.entity.User

/**
 * 验证登录信息
 */
class VerifyLogin  {


    /**
     * 校验此次登录是否合法
     * @username 传进来的用户名
     * @password 传进来的用户密码
     * @Int 如果验证成功，则返回该用户的权限等级. 如果返回0则证明账号密码不正确
     */
     companion object {
        var userDao: UserDao? =null
        var userDatabase: UserDatabase? = null
        fun verify(username: String, password: String,t:Context):Int {
            val student = User(1,"111","111",1)
            val teacher = User(2,"222","222",2)
            val admin = User(3,"333","333",3)
            userDatabase = Room.databaseBuilder(t,UserDatabase::class.java,"User.db")
                .allowMainThreadQueries()
                .build()
            userDao = userDatabase!!.getUserDao()
            userDao!!.insert(student)
            userDao!!.insert(teacher)
            userDao!!.insert(admin)

            val re = userDao!!.login(username,password)

            //连接到数据库进行验 证...
            return re
        }

    }



}