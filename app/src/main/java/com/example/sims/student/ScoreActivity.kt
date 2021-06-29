package com.example.sims.student

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.room.Room
import com.example.sims.R
import com.example.sims.database.ScoreDatabase
import com.example.sims.database.StudentDatabase
import com.example.sims.databinding.ActivityScoreBinding
import com.example.sims.login.VerifyLogin

class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        showScore()


    }

    private fun showScore() {
        val list  =  ArrayList<TextView>()

        var binding: ActivityScoreBinding = ActivityScoreBinding.inflate(layoutInflater)

        val root = binding.root
        setContentView(root)

        list.add(binding.score1);
        list.add(binding.score2);
        list.add(binding.score3);
        list.add(binding.score4);
        list.add(binding.score5);
        list.add(binding.score6);
        list.add(binding.score7);
        list.add(binding.score8);
        list.add(binding.score9);
        list.add(binding.score10);
        list.add(binding.score11);
        list.add(binding.score12);
        list.add(binding.score13);
        list.add(binding.score14);
        list.add(binding.score15);
        list.add(binding.score16);
        list.add(binding.score17);
        list.add(binding.score18);
        list.add(binding.score19);
        list.add(binding.score20);
        list.add(binding.score21);
        list.add(binding.score22);
        list.add(binding.score23);
        list.add(binding.score24);

        var scoreDatabase = Room.databaseBuilder(this, ScoreDatabase::class.java,"Score.db")
                .allowMainThreadQueries()
                .build()
        var scoreDao = scoreDatabase.getScoreDao()
        var score1 = scoreDao.select(VerifyLogin.username!!.toInt(),"1")
        var score2 = scoreDao.select(VerifyLogin.username!!.toInt(),"2")
        var score3 = scoreDao.select(VerifyLogin.username!!.toInt(),"3")

        binding.score1.text = "1";
        binding.score2.text = "语文";
        binding.score3.text = "无";
        if(score1 == -1){
            binding.score3.text = "成绩未录入";
        }else {
            binding.score3.text = score1.toString();
        }
        binding.score4.text = "2";
        binding.score5.text = "数学";
        binding.score6.text = "无";
        if(score2 == -1){
            binding.score6.text = "成绩未录入";
        }else {
            binding.score6.text = score2.toString();
        }
        binding.score7.text = "3";
        binding.score8.text = "英语";
        binding.score9.text = "无";
        if(score3 == -1){
            binding.score9.text = "成绩未录入";
        }else {
            binding.score9.text = score3.toString();
        }





    }


}


