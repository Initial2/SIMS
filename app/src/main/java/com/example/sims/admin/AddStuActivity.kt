package com.example.sims.admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.room.Room
import com.example.sims.R
import com.example.sims.dao.StudentDao
import com.example.sims.database.StudentDatabase
import com.example.sims.databinding.ActivityAddStuBinding
import com.example.sims.entity.Student


class AddStuActivity : AppCompatActivity() , View.OnClickListener {

    var inflate : ActivityAddStuBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_stu)

        inflate = ActivityAddStuBinding.inflate(layoutInflater)
        setContentView(inflate!!.root)

        //设置提交按钮监听事件
        inflate!!.submitButton2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var studentDao: StudentDao

        var newName = inflate?.stuName3!!.text
        var newAge = inflate?.stuAge3!!.text
        var newGender = inflate?.gender3!!.text
        var newTel = inflate?.tel3!!.text
        var newAddress = inflate?.address!!.text
        var newStudentID = inflate?.studentId3!!.text

        var studentDatabase: StudentDatabase =
            Room.databaseBuilder(this, StudentDatabase::class.java,"Student.db")
                .allowMainThreadQueries()
                .build()
        studentDao = studentDatabase.getStudentDao()
        //获取完就插入到数据库中

        val student1 = Student(null,null,null,null,null,null)

        student1.name = newName?.toString()
        student1.age = newAge?.toString()
        student1.sex = newGender?.toString()
        student1.student_id = newStudentID?.toString()?.toInt()
        student1.tel = newTel?.toString()
        student1.address = newAddress?.toString()

        studentDao.insert(student1)

        Toast.makeText(this@AddStuActivity, "已提交", Toast.LENGTH_SHORT).show()


    }
}