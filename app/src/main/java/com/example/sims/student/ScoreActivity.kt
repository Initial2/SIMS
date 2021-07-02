package com.example.sims.student

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import com.example.sims.R
import java.util.ArrayList


class ScoreActivity : AppCompatActivity() {

    //ListView组件
    private var testLv: ListView? = null
    private val dataList: MutableList<String> = ArrayList() //存储数据
    private var scoreAdapter //ListView的数据适配器
            : ScoreAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        initView() //初始化组件
        initData() //初始化数据
    }

    /**
     * 初始化组件
     */
    private fun initView() {
        testLv = findViewById<View>(R.id.test_lv) as ListView
    }

    /**
     * 初始化数据
     */
    private fun initData() {
        //初始化10项数据
        for (i in 1..20) {
            //add()添加信息 把数据库信息添加过来
            dataList.add("111  张三 10086$i")
        }


        //设置ListView的适配器
        scoreAdapter = ScoreAdapter(this, dataList)
        testLv!!.adapter = scoreAdapter
        testLv!!.setSelection(4)

    }





}


