package com.example.sims.student

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sims.R
import com.example.sims.databinding.ActivityScoreBinding

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


        binding.score1.text = "2131";
        binding.score2.text = "1231";
        binding.score3.text = "1231";
        binding.score4.text = "1231";





    }


}


