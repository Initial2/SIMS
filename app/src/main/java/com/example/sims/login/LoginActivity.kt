package com.example.sims.login


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sims.*
import com.example.sims.admin.AdminActivity
import com.example.sims.student.StudentActivity
import com.example.sims.teacher.TeacherActivity

/**
 * 登录界面
 */
class LoginActivity : AppCompatActivity(), View.OnClickListener {

    var button: Button? = null
    var username: EditText? = null
    var password: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //获取XML文件对应的标签信息
        button = findViewById<View>(R.id.login) as Button
        username = findViewById<View>(R.id.username) as EditText
        password = findViewById<View>(R.id.password) as EditText

        //设置按钮监听事件
        button!!.setOnClickListener(this)
    }

    //按钮监听事件
    override fun onClick(v: View?) {
        //获取用户输入的账号密码
        val username = username!!.text.toString()
        val password = password!!.text.toString()

        //获取到权限等级
        val verify = VerifyLogin.verify(username, password);

        //进行权限判断
        when (1) {
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