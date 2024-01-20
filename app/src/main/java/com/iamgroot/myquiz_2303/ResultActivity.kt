package com.iamgroot.myquiz_2303

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.color.utilities.Score
import com.iamgroot.myquiz_2303.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityResultBinding.inflate(layoutInflater)


        setContentView(binding.root)

        var score = intent.getIntExtra("score", 0)
        binding.scoreTv.text = "Score : $score"
    }
}