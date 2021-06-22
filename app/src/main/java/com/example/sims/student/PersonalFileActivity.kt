package com.example.sims.student

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.sims.R
import com.example.sims.login.LoginActivity


/**
 * 学生档案查看页面
 */
class PersonalFileActivity : AppCompatActivity() {

    //拿到该学生的学号。
    val studentID = LoginActivity().username


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
        var name = findViewById<View>(R.id.stuName) as TextView
        var age = findViewById<View>(R.id.stuAge) as TextView
        var gender = findViewById<View>(R.id.gender) as TextView
        var studentID = findViewById<View>(R.id.student_id) as TextView
        var tel = findViewById<View>(R.id.tel) as TextView
        var address = findViewById<View>(R.id.textView11) as TextView

        //从数据库查询出来的值，然后赋值给下列属性即可
        name.text = "这里是从数据库获取到的它的姓名"
        age.text = "";
        gender.text = "";
        studentID.text = "";
        tel.text = "";
        address.text = "";
    }












}


