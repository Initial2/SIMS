package com.example.sims.admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.room.Room
import com.example.sims.R
import com.example.sims.database.ScoreDatabase
import com.example.sims.databinding.ActivityDistributeCourseBinding
import com.example.sims.entity.Score


class DistributeCourseActivity : AppCompatActivity() ,View.OnClickListener{
    var biding : ActivityDistributeCourseBinding? = null;
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_distribute_course)


        biding = ActivityDistributeCourseBinding.inflate(layoutInflater)

        setContentView(biding!!.root)

        biding!!.button3.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val stuID = biding?.studentID?.text
        val courseID = biding?.courseID?.text


        //插入数据库即可。 某个学生选修了某门课
        var scoreDatabase = Room.databaseBuilder(this, ScoreDatabase::class.java,"Score.db")
                .allowMainThreadQueries()
                .build()
        var scoreDao = scoreDatabase.getScoreDao()

        var score = Score(stuID.toString().toInt(),courseID.toString().toInt(),-1)
        scoreDao.insert(score)

        //最后提示消息
        val success = "提交成功"
        Toast.makeText(this@DistributeCourseActivity, success, Toast.LENGTH_SHORT).show()
    }
}