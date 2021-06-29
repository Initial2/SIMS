package com.example.sims.teacher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.room.Room
import com.example.sims.dao.ScoreDao
import com.example.sims.dao.StudentDao
import com.example.sims.database.ScoreDatabase
import com.example.sims.database.StudentDatabase
import com.example.sims.databinding.ActivityModifyScoreBinding
import com.example.sims.entity.Score


class ModifyScoreActivity : AppCompatActivity() , View.OnClickListener {


    var inflate : ActivityModifyScoreBinding? = null
    var scoreDao : ScoreDao? = null
    var scoreDatabase : ScoreDatabase? = null
    var studentDao : StudentDao? = null
    var studentDatabase : StudentDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        inflate = ActivityModifyScoreBinding.inflate(layoutInflater);
        setContentView(inflate!!.root);

        //建立学生表的数据库连接
        studentDatabase = Room.databaseBuilder(this, StudentDatabase::class.java,"Student.db")
                .allowMainThreadQueries()
                .build()

        //建立成绩表的数据库连接
        scoreDatabase = Room.databaseBuilder(this,ScoreDatabase::class.java,"Score.db")
                .allowMainThreadQueries()
                .build()



        inflate!!.button2.setOnClickListener(this);


    }

    override fun onClick(v: View?) {

        //获取到的输入信息。
        val stuID = inflate!!.inputStuid.text;
        val name = inflate!!.inputName.text;
        val courseName = inflate!!.inputCourse.text;
        var score = inflate!!.stuScore.text;

        studentDao = studentDatabase?.getStudentDao()
        var studentTest = studentDao?.show(stuID.toString().toInt())

        //查询是否有这名学生，有的话继续
        if(studentTest==null){
            val fail = "找不到改同学，请检查学号"
            Toast.makeText(this@ModifyScoreActivity, fail, Toast.LENGTH_SHORT).show()
        }else{
            scoreDao = scoreDatabase?.getScoreDao()
            var student = Score(stuID.toString().toInt(),courseName.toString().toInt(), score.toString().toInt())
            scoreDao?.insert(student)
            val fail = "成绩添加成功"
            Toast.makeText(this@ModifyScoreActivity, fail, Toast.LENGTH_SHORT).show()

        }
        //获取到成绩，然后去查查该学生是否学了这门课。 没有的话就报错
//        if(true){
//            val fail = "添加失败"
//            Toast.makeText(this@ModifyScoreActivity, fail, Toast.LENGTH_SHORT).show()
//
//        }else{
            //如果选了这门课，则可以添加
            //....添加成绩

            //添加成功后，清空所有输入框信息
//            val success = "添加成功"
//            Toast.makeText(this@ModifyScoreActivity, success, Toast.LENGTH_SHORT).show()
            inflate!!.inputStuid.setText("")
            inflate!!.inputName.setText("")
            inflate!!.inputCourse.setText("")
            inflate!!.stuScore.setText("")
        }




    }


