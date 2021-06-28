package com.example.sims.student

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.sims.R
import com.example.sims.databinding.ActivityStudentBinding
import kotlin.system.exitProcess


/**
 * 学生登录界面
 */
class StudentActivity : AppCompatActivity(), View.OnClickListener {


   /* private var personal: Button? = null
    private var scoreButton: Button? = null
    private var modifyButton: Button? = null
    private var classmatesButton: Button? = null
    private var exitButton: Button? = null*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_student)



        val inflate = ActivityStudentBinding.inflate(layoutInflater)
        val root = inflate.root
        setContentView(root)



        //设置按钮监听事件
        inflate.personalFileButton.setOnClickListener(this)
        inflate.scoreButton.setOnClickListener(this)
        inflate.modifyButton.setOnClickListener(this)
        inflate.classmatesButton.setOnClickListener(this)
        inflate.exitButton.setOnClickListener(this)


       /* modifyButton = inflate.modifyButton
        classmatesButton =  inflate.classmatesButton
        exitButton = inflate.exitButton

        scoreButton!!.setOnClickListener(this)
        modifyButton!!.setOnClickListener(this)
        classmatesButton!!.setOnClickListener(this)
        exitButton!!.setOnClickListener(this)*/
    }


    /**
     * 别处理每个按钮的监听事件
     */
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.personal_file_button -> {
                //点击查看个人档案按钮，就打开PersonalFileActivity
                val intent = Intent(this@StudentActivity, PersonalFileActivity::class.java)
                startActivity(intent)
            }
            R.id.score_button -> {
                //查看学生成绩
                val intent = Intent(this@StudentActivity, ScoreActivity::class.java)
                startActivity(intent)
            }

            R.id.modify_button -> {
                //修改个人信息
                val intent = Intent(this@StudentActivity, ModifyActivity::class.java)
                startActivity(intent)
            }

            R.id.classmates_button -> {
              /*  val intent = Intent(this@StudentActivity, ClassMatesActivity::class.java)
                startActivity(intent)*/
            }

            R.id.exit_button -> {
                exitProcess(5)
            }

        }

    }


}