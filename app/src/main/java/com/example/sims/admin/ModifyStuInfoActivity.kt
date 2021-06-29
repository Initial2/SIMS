package com.example.sims.admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sims.R
import com.example.sims.databinding.ActivityAddStuBinding
import com.example.sims.databinding.ActivityModifyStuInfoBinding

class ModifyStuInfoActivity : AppCompatActivity(), View.OnClickListener {

    var inflate : ActivityModifyStuInfoBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modify_stu_info)

        inflate = ActivityModifyStuInfoBinding.inflate(layoutInflater)
        setContentView(inflate!!.root)

        inflate!!.searchButton.setOnClickListener(this)




    }

    override fun onClick(v: View?) {
        //获取输入的学号
        val ID = inflate?.inputStuID?.text

        //根据ID查找指定学生的信息，然后显示
        inflate?.stuName4?.setText("111")
        inflate?.stuAge4?.setText("111")
        inflate?.gender4?.setText("11")
        inflate?.studentId4?.setText("111")
        inflate?.tel4?.setText("111")
        inflate?.address3?.setText("111")

    }

    //提交按钮的事件
    fun submit(v: View?){
        //获取到每个值
        val name = inflate?.stuName4?.text
        val age = inflate?.stuAge4?.text
        val gender = inflate?.gender4?.text
        val stuID = inflate?.studentId4?.text
        val tel = inflate?.tel4?.text
        val address = inflate?.address3?.text

        //根据stuID插入数据
        //...
    }

}