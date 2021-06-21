package com.example.sims.student

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.sims.R

class StudentActivity : AppCompatActivity() , View.OnClickListener {


    var personal : Button? = null
    var scoreButton : Button? = null
    var modifyButton : Button? = null
    var classmatesButton : Button? = null
    var exitButton : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        //获取到按钮
        personal = findViewById<View>(R.id.personal_file_button) as Button
        scoreButton = findViewById<View>(R.id.score_button) as Button
        modifyButton = findViewById<View>(R.id.modify_button) as Button
        classmatesButton = findViewById<View>(R.id.classmates_button) as Button
        exitButton = findViewById<View>(R.id.exit_button) as Button

        //设置按钮监听事件
        personal!!.setOnClickListener(this)
        scoreButton!!.setOnClickListener(this)
        modifyButton!!.setOnClickListener(this)
        classmatesButton!!.setOnClickListener(this)
        exitButton!!.setOnClickListener(this)
    }


    /**
     * 别处理每个按钮的监听事件
     */
    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.personal_file_button ->{
                //点击查看个人档案按钮，就打开PersonalFileActivity
                val intent = Intent(this@StudentActivity, PersonalFileActivity::class.java)
                startActivity(intent)}
            R.id.score_button ->{}

            R.id.modify_button ->{}

            R.id.classmates_button ->{}

            R.id.exit_button ->{}

        }

    }


}