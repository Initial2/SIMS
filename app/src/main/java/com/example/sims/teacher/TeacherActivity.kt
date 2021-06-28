package com.example.sims.teacher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sims.databinding.ActivityTeacherBinding

class TeacherActivity : AppCompatActivity() ,  View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val inflate = ActivityTeacherBinding.inflate(layoutInflater);
        setContentView(inflate.root);

        inflate.button.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        val intent = Intent(this@TeacherActivity, ModifyScoreActivity::class.java)
        startActivity(intent)

    }


}