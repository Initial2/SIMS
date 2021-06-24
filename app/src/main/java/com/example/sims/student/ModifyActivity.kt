package com.example.sims.student

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.room.Room
import com.example.sims.dao.StudentDao
import com.example.sims.database.StudentDatabase
import com.example.sims.databinding.ActivityModifyBinding
import com.example.sims.entity.Student
import com.example.sims.login.VerifyLogin

class ModifyActivity : AppCompatActivity()  , View.OnClickListener{
    var inflate : ActivityModifyBinding? = null
    var studentShow : Student? = null
    var studentDao : StudentDao? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_modify)
        inflate = ActivityModifyBinding.inflate(layoutInflater)
        setContentView(inflate!!.root)
        var newName = inflate?.stuName2
        var newAge = inflate?.stuAge2
        var newGender = inflate?.gender2
        var newTel = inflate?.tel2
        var newAddress = inflate?.address2
        var newStudentID = inflate?.studentId2
        //数据库连接建立
        var studentDatabase = Room.databaseBuilder(this,StudentDatabase::class.java,"Student.db")
                .allowMainThreadQueries()
                .build()
        studentDao = studentDatabase.getStudentDao()
        studentShow = studentDao!!.show(VerifyLogin.username!!.toInt())

        newName?.setText(studentShow!!.name)
        newAge?.setText(studentShow!!.age)
        newGender?.setText(studentShow!!.sex)
        newTel?.setText(studentShow!!.tel)
        newAddress?.setText(studentShow!!.address)
        newStudentID?.text = studentShow!!.student_id.toString()

        //设置提交按钮监听事件
        inflate!!.submitButton.setOnClickListener(this)

    }


    //提交后执行的代码逻辑
    override fun onClick(v: View?) {
        //1. 首先拿到他的登录账号，根据它的登录账号修改Student表信息


        //2. 获取所有文本框的值，然后进行插入修改
        var newName = inflate?.stuName2?.text
        var newAge = inflate?.stuAge2?.text
        var newGender = inflate?.gender2?.text
        var newTel = inflate?.tel2?.text
        var newAddress = inflate?.address2?.text

        //3. 接下来链接数据库，然后插入信息
        studentShow?.name = newName.toString()
        studentShow?.age = newAge.toString()
        studentShow?.sex = newGender.toString()
        studentShow?.tel = newTel.toString()
        studentShow?.address = newAddress.toString()
        studentShow?.let { studentDao?.insert(it) }
        //4. 显示信息
        val message =  "已提交修改"
        Toast.makeText(this@ModifyActivity, message, Toast.LENGTH_SHORT).show()
    }


}