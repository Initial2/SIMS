package com.example.sims.student

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.sims.R
import com.example.sims.databinding.ActivityClassMatesBinding

class ClassMatesActivity : AppCompatActivity() {


    var inflate : ActivityClassMatesBinding? = null

    private val data= listOf("数据1","数据2","数据1","数据1","数据1","数据1","数据1","数据1","数据1","数据1")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_mates)
//        supportActionBar?.hide()
        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data)

        inflate = ActivityClassMatesBinding.inflate(layoutInflater)

        inflate!!.listview.adapter = adapter


    }
}