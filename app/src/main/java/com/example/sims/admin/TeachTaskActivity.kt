package com.example.sims.admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.sims.R
import com.example.sims.databinding.ActivityTeachTaskBinding

class TeachTaskActivity : AppCompatActivity() ,View.OnClickListener{
    var biding : ActivityTeachTaskBinding? = null;


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teach_task)


        biding = ActivityTeachTaskBinding.inflate(layoutInflater)

        setContentView(biding!!.root)

        biding!!.button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val teacherID = biding?.studentID2?.text
        val courseID = biding?.courseID2?.text


        //插入数据库即可




        //最后提示消息
        val success = "提交成功"
        Toast.makeText(this@TeachTaskActivity, success, Toast.LENGTH_SHORT).show()




    }
}