package com.example.sims.student

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.sims.R
import java.util.*

class ClassmatesActivity : AppCompatActivity() {
            //ListView组件
    private var testLv: ListView? = null
    private val updateDataBtn //动态加载数据组件
            : Button? = null
    private val dataList: MutableList<String> = ArrayList() //存储数据
    private var listViewDemoAdapter //ListView的数据适配器
            : ClassmatesAdapterActivity? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classmates)
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
        listViewDemoAdapter = ClassmatesAdapterActivity(this, dataList)
        testLv!!.adapter = listViewDemoAdapter
        testLv!!.setSelection(4)
    }


}