package com.example.sims.admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sims.R
import com.example.sims.databinding.ActivityAddStuBinding
import com.example.sims.databinding.ActivityModifyBinding


class AddStuActivity : AppCompatActivity() , View.OnClickListener {

    var inflate : ActivityAddStuBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_stu)

        inflate = ActivityAddStuBinding.inflate(layoutInflater)
        setContentView(inflate!!.root)

        //设置提交按钮监听事件
        inflate!!.submitButton2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        var newName = inflate?.stuName3!!.text
        var newAge = inflate?.stuAge3!!.text
        var newGender = inflate?.gender3!!.text
        var newTel = inflate?.tel3!!.text
        var newAddress = inflate?.address!!.text
        var newStudentID = inflate?.studentId3!!.text


        //获取完就插入到数据库中





    }
}