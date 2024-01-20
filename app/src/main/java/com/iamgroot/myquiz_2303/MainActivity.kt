package com.iamgroot.myquiz_2303

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.iamgroot.myquiz_2303.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.startbtn.setOnClickListener {

            val playIntent=Intent(this@MainActivity, PlayActivity::class.java)
            startActivity(playIntent)

        }
}}
