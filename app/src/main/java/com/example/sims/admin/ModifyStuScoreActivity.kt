package com.example.sims.admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.sims.R
import com.example.sims.databinding.ActivityModifyStuScoreBinding

class ModifyStuScoreActivity : AppCompatActivity() ,View.OnClickListener{

    var inflate : ActivityModifyStuScoreBinding? = null

    val list  =  ArrayList<TextView>()
    var inputStuID : String? = null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modify_stu_score)


        inflate = ActivityModifyStuScoreBinding.inflate(layoutInflater)
        inflate!!.button6.setOnClickListener(this)

        //获取学号
        inputStuID = inflate!!.inputStuID.toString()



        list.add(inflate!!.score1);
        list.add(inflate!!.score2);
        list.add(inflate!!.score3);
        list.add(inflate!!.score4);
        list.add(inflate!!.score5);
        list.add(inflate!!.score6);
        list.add(inflate!!.score7);
        list.add(inflate!!.score8);
        list.add(inflate!!.score9);
        list.add(inflate!!.score10);
        list.add(inflate!!.score11);
        list.add(inflate!!.score12);
        list.add(inflate!!.score13);
        list.add(inflate!!.score14);
        list.add(inflate!!.score15);
        list.add(inflate!!.score16);
        list.add(inflate!!.score17);
        list.add(inflate!!.score18);

    }


    /**
     * 查询成绩按钮绑定事件
     */
    fun queryScore(v: View?){
        //查询对应学号的学生成绩，然后显示出来. 学号为inputStuID


        //跟之前一样。 1对应课程号  2课程名  3成绩
        for( j in 1..list.size step 3){

            //把查出来的信息一条一条的显示
            list[j].text = "课程号"
            list[j+1].text = "课程名"
            list[j+2].text =  "成绩"


            //为空就跳出循环，不用再插入了
            if (list[j] == null){
                break
            }

        }

    }

    /**
     * 修改成绩监听事件
     */
    override fun onClick(v: View?) {
       //获取它的每门课成绩，然后修改数据库数据即可
        // 都在list里面 步长设置为3
        for( j in 1..list.size step 3){

            val courseNum = list[j].text
            val courseName = list[j+1].text
            val score = list[j+2].text
            //每获取一条成绩，就插入数据库一次.
            //....插入数据库操作



            //为空就跳出循环，不用再插入了
            if (list[j] == null){
                break
            }

        }

    }
}