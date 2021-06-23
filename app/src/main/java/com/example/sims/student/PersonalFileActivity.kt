package com.example.sims.student

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.sims.R
import com.example.sims.dao.StudentDao
import com.example.sims.database.StudentDatabase
import com.example.sims.databinding.ActivityPersonalFileBinding
import com.example.sims.entity.Student
import com.example.sims.login.LoginActivity
import com.example.sims.login.VerifyLogin


/**
 * 学生档案查看页面
 */
class PersonalFileActivity : AppCompatActivity() {
    private var inflate : ActivityPersonalFileBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_personal_file)


        //使用ViewBiding
        inflate = ActivityPersonalFileBinding.inflate(layoutInflater)
        val root = inflate!!.root
        setContentView(root)
        showInfo()
    }


    /**
     * 从数据库获取对应的个人信息，然后显示出来
     * 根据学号查个人信息
     */
    private fun showInfo() {
        var studentDao:StudentDao

        var  name = inflate?.stuName
        var age = inflate?.stuAge
        var gender = inflate?.gender
        var studentID = inflate?.studentId
        var tel = inflate?.tel
        var address = inflate?.textView11

        /*
        var name = findViewById<View>(R.id.stuName) as TextView
        var age = findViewById<View>(R.id.stuAge) as TextView
        var gender = findViewById<View>(R.id.gender) as TextView
        var studentID = findViewById<View>(R.id.student_id) as TextView
        var tel = findViewById<View>(R.id.tel) as TextView
        var address = findViewById<View>(R.id.textView11) as TextView
        */


        val student1 = Student(111,"张三","15","男","13539465745","郑州市")
        var studentDatabase:StudentDatabase =
            Room.databaseBuilder(this,StudentDatabase::class.java,"Student.db")
            .allowMainThreadQueries()
            .build()
        studentDao = studentDatabase.getStudentDao()
        studentDao.insert(student1)

//        var studentShow = Student(122,"11","15","1","13539465745","郑州市")

        var studentShow = studentDao.show(VerifyLogin.username!!.toInt())
        //从数据库查询出来的值，然后赋值给下列属性即可
        if (name != null) {
            name.text = studentShow.name
        }
        if (age != null) {
            age.text = studentShow.age
        }
        if (gender != null) {
            gender.text = studentShow.sex
        }
        if (studentID != null) {
            studentID.text = studentShow.student_id.toString()
        }
        if (tel != null) {
            tel.text = studentShow.tel
        }
        if (address != null) {
            address.text = studentShow.address
        }
    }












}


