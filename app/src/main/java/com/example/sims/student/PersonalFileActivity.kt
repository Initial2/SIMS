package com.example.sims.student

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.sims.R
import com.example.sims.dao.StudentDao
import com.example.sims.database.StudentDatabase
import com.example.sims.entity.Student
import com.example.sims.login.LoginActivity
import com.example.sims.login.VerifyLogin


/**
 * 学生档案查看页面
 */
class PersonalFileActivity : AppCompatActivity() {

    //拿到该学生的学号。
    val studentIDShow = LoginActivity().username

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_file)
        showInfo()
    }


    /**
     * 从数据库获取对应的个人信息，然后显示出来
     * 根据学号查个人信息
     */
    private fun showInfo() {
        var studentDao:StudentDao
        var studentDatabase:StudentDatabase
        var name = findViewById<View>(R.id.stuName) as TextView
        var age = findViewById<View>(R.id.stuAge) as TextView
        var gender = findViewById<View>(R.id.gender) as TextView
        var studentID = findViewById<View>(R.id.student_id) as TextView
        var tel = findViewById<View>(R.id.tel) as TextView
        var address = findViewById<View>(R.id.textView11) as TextView

        val student1 = Student(111,"张三","15","男","13539465745","郑州市")
        studentDatabase = Room.databaseBuilder(this,StudentDatabase::class.java,"Student.db")
            .allowMainThreadQueries()
            .build()
        studentDao = studentDatabase.getStudentDao()
        studentDao.insert(student1)

//        var studentShow = Student(122,"11","15","1","13539465745","郑州市")

        var studentShow = studentDao.show(VerifyLogin.username!!.toInt())
        //从数据库查询出来的值，然后赋值给下列属性即可
        name.text = studentShow.name
        age.text = studentShow.age
        gender.text = studentShow.sex
        studentID.text = studentShow.student_id.toString()
        tel.text = studentShow.tel
        address.text = studentShow.address
    }












}


