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
import com.example.sims.databinding.ActivityModifyStuInfoBinding
import com.example.sims.entity.Student
import com.example.sims.login.VerifyLogin

class ModifyStuInfoActivity : AppCompatActivity(), View.OnClickListener {

    var inflate : ActivityModifyStuInfoBinding? = null
    var studentShow : Student? = null
    var studentDao : StudentDao? = null
    var studentDatabase : StudentDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modify_stu_info)

        inflate = ActivityModifyStuInfoBinding.inflate(layoutInflater)
        setContentView(inflate!!.root)

        studentDatabase = Room.databaseBuilder(this, StudentDatabase::class.java,"Student.db")
            .allowMainThreadQueries()
            .build()


        inflate!!.searchButton.setOnClickListener(this)




    }

    override fun onClick(v: View?) {
        //获取输入的学号
        val ID = inflate?.inputStuID?.text

        studentDao = studentDatabase?.getStudentDao()
        studentShow = studentDao!!.show(ID.toString().toInt())

        //根据ID查找指定学生的信息，然后显示
        inflate?.stuName4?.setText(studentShow!!.name)
        inflate?.stuAge4?.setText(studentShow!!.age)
        inflate?.gender4?.setText(studentShow!!.sex)
        inflate?.studentId4?.setText(studentShow!!.student_id.toString())
        inflate?.tel4?.setText(studentShow!!.tel)
        inflate?.address3?.setText(studentShow!!.address)

    }

    //提交按钮的事件
    fun submit(v: View?){
        //获取到每个值
        val name = inflate?.stuName4?.text
        val age = inflate?.stuAge4?.text
        val gender = inflate?.gender4?.text
        val stuID = inflate?.studentId4?.text
        val tel = inflate?.tel4?.text
        val address = inflate?.address3?.text

        //根据stuID插入数据
        studentShow?.name = name.toString()
        studentShow?.age = age.toString()
        studentShow?.sex = gender.toString()
        studentShow?.student_id = stuID.toString().toInt()
        studentShow?.tel = tel.toString()
        studentShow?.address = address.toString()

        studentShow?.let { studentDao?.insert(it) }
        //...
        Toast.makeText(this@ModifyStuInfoActivity, "已提交修改", Toast.LENGTH_SHORT).show()
    }

}