package com.example.final_rock_paper_scissors_zk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var StartGameButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        listeners()
    }


    fun listeners(){
        StartGameButton.setOnClickListener{
            val intent = Intent(this, GameProcess::class.java)
            startActivity(intent)
        }
    }


    fun init(){
        StartGameButton = findViewById(R.id.button)
    }
}