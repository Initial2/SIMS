package com.example.sims.student

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.sims.R
import com.example.sims.databinding.ActivityClassMatesBinding

class ClassMatesActivity : AppCompatActivity() {


    var inflate : ActivityClassMatesBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_mates)
//        supportActionBar?.hide()

        inflate = ActivityClassMatesBinding.inflate(layoutInflater)

        show()

    }


    fun show(){
        //根据该学生的登录账号，也就是学号，去查询他的同班同学信息。 然后显示
    }

}