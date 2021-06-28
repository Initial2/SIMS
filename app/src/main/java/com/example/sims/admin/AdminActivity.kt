package com.example.sims.admin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sims.R
import com.example.sims.databinding.ActivityAdminBinding
import com.example.sims.student.ModifyActivity
import com.example.sims.student.PersonalFileActivity
import com.example.sims.student.ScoreActivity
import kotlin.system.exitProcess

class AdminActivity : AppCompatActivity(), View.OnClickListener {
    var inflate : ActivityAdminBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        inflate = ActivityAdminBinding.inflate(layoutInflater);
        setContentView(inflate!!.root);

        inflate!!.inputStuInfo.setOnClickListener(this)
        inflate!!.stuCourse.setOnClickListener(this)
        inflate!!.modifyScore.setOnClickListener(this)
        inflate!!.modifyStuInfo.setOnClickListener(this)
        inflate!!.teachTask.setOnClickListener(this)




    }

    override fun onClick(v: View?) {
        when (v?.id) {
           R.id.input_stuInfo -> {
                //点击查看个人档案按钮，就打开PersonalFileActivity
                val intent = Intent(this@AdminActivity, SearchStuInfoActivity::class.java)
                startActivity(intent)
            }
            R.id.stu_course -> {
                //查看学生成绩
                val intent = Intent(this@AdminActivity, DistributeCourseActivity::class.java)
                startActivity(intent)
            }

            R.id.modify_score -> {
                //修改个人信息
                val intent = Intent(this@AdminActivity, ModifyStuScoreActivity::class.java)
                startActivity(intent)
            }

            R.id.modify_stuInfo -> {
                  val intent = Intent(this@AdminActivity, ModifyStuInfoActivity::class.java)
                  startActivity(intent)
            }

            R.id.teach_task -> {

            }

        }

    }


}