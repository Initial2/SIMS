package com.example.sims.teacher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.sims.databinding.ActivityModifyScoreBinding



class ModifyScoreActivity : AppCompatActivity() , View.OnClickListener {


    var inflate : ActivityModifyScoreBinding? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        inflate = ActivityModifyScoreBinding.inflate(layoutInflater);
        setContentView(inflate!!.root);

        inflate!!.button2.setOnClickListener(this);


    }

    override fun onClick(v: View?) {

        //获取到的输入信息。
        val stuID = inflate!!.inputStuid.text;
        val name = inflate!!.inputName.text;
        val courseName = inflate!!.inputCourse.text;
        var score = inflate!!.stuScore.text;


        //获取到成绩，然后去查查该学生是否学了这门课。 没有的话就报错
        if(true){
            val fail = "添加失败"
            Toast.makeText(this@ModifyScoreActivity, fail, Toast.LENGTH_SHORT).show()

        }else{
            //如果选了这门课，则可以添加
            //....添加成绩





            //添加成功后，清空所有输入框信息
            val success = "添加成功"
            Toast.makeText(this@ModifyScoreActivity, success, Toast.LENGTH_SHORT).show()
            inflate!!.inputStuid.setText("")
            inflate!!.inputName.setText("")
            inflate!!.inputCourse.setText("")
            inflate!!.stuScore.setText("")
        }




    }


}