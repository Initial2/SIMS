package com.example.sims.login


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import com.example.sims.*
import com.example.sims.admin.AdminActivity
import com.example.sims.databinding.ActivityLoginBinding
import com.example.sims.student.StudentActivity
import com.example.sims.teacher.TeacherActivity

/**
 * 登录界面
 */
class LoginActivity : AppCompatActivity(), View.OnClickListener {


    @Nullable
    private var usernameEditText : EditText? = null

    @Nullable
    private var passwordEditText : EditText? = null

    @Nullable
    var username: String? = null

    @Nullable
    var password: String? = null


    @Nullable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //不知道干啥用的，注释掉也没事。
        setContentView(R.layout.activity_login)

        //使用ViewBiding
        val biding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(biding.root)



        //获取XML文件对应的标签信息
        biding.login.setOnClickListener(this)
        usernameEditText = biding.username
        passwordEditText = biding.password


    }

    //按钮监听事件

    override fun onClick(v: View?) {
        //获取用户输入的账号密码
        username = usernameEditText!!.text.toString()
        password = passwordEditText!!.text.toString()


        //进行权限判断
        when (VerifyLogin.verify(username!!, password!!,this)) {
            0 -> {
                // 0就提示登陆失败
                val fail = "登录失败"
                Toast.makeText(this@LoginActivity, fail, Toast.LENGTH_SHORT).show()

            }

            1 -> {
                //1 就打开学生界面
                val message =  "登陆成功， 你当前的身份为：学生"
                Toast.makeText(this@LoginActivity, message, Toast.LENGTH_SHORT).show()
                val intent = Intent(this@LoginActivity, StudentActivity::class.java)
                startActivity(intent)
            }

            2 -> {
                //2 就打开教师界面
                val message =  "登陆成功， 你当前的身份为：教师"
                Toast.makeText(this@LoginActivity, message, Toast.LENGTH_SHORT).show()
                val intent = Intent(this@LoginActivity, TeacherActivity::class.java)
                startActivity(intent)
            }

            3 -> {
                //3 就打开管理员界面
                val message =  "登陆成功， 你当前的身份为：管理员"
                Toast.makeText(this@LoginActivity, message, Toast.LENGTH_SHORT).show()
                val intent = Intent(this@LoginActivity, AdminActivity::class.java)
                startActivity(intent)
            }
        }


    }
}