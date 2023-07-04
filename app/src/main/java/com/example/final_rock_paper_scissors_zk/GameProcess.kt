package com.example.final_rock_paper_scissors_zk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlin.random.Random

class GameProcess : AppCompatActivity() {

    lateinit var rockButton: Button
    lateinit var scissorsButton: Button
    lateinit var paperButton: Button
    lateinit var tryAgain:Button
    lateinit var textviewDotsButton:TextView
    lateinit var YH : TextView
    lateinit var BH : TextView
    val otherStrings = arrayOf("rock", "scissors", "paper")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_process)
        init()
        listeners()
    }

    fun RandomStrFromArray() : String{
        var comp = (0..2).random()
        return otherStrings[comp]
    }

    fun listeners() {
        rockButton.setOnClickListener {
            rockButton.isEnabled = false
            rockButton.isClickable = false
            scissorsButton.isEnabled = false
            scissorsButton.isClickable = false
            paperButton.isEnabled = false
            paperButton.isClickable = false
            YH.text = "Rock"
            var ans = RandomStrFromArray()
            BH.text = ans
            if (ans == "rock") {
                textviewDotsButton.text = "Draw"
            } else if (ans == "scissors") {
                textviewDotsButton.text = "You won!!!"
            } else if (ans == "paper") {
                textviewDotsButton.text = "You lost!"
            }


        }

        scissorsButton.setOnClickListener{
            rockButton.isEnabled = false
            rockButton.isClickable = false
            scissorsButton.isEnabled = false
            scissorsButton.isClickable = false
            paperButton.isEnabled = false
            paperButton.isClickable = false
            YH.text = "Scissors"
            var ans = RandomStrFromArray()
            BH.text = ans
            if (ans == "rock") {
                textviewDotsButton.text = "You lost!"
            } else if (ans == "scissors") {
                textviewDotsButton.text = "Draw"
            } else if (ans == "paper") {
                textviewDotsButton.text = "You win!!!"
            }
        }

        paperButton.setOnClickListener {
            rockButton.isEnabled = false
            rockButton.isClickable = false
            scissorsButton.isEnabled = false
            scissorsButton.isClickable = false
            paperButton.isEnabled = false
            paperButton.isClickable = false
            YH.text = "Paper"
            var ans = RandomStrFromArray()
            BH.text = ans
            if (ans == "rock") {
                textviewDotsButton.text = "You win!!!"
            } else if (ans == "scissors") {
                textviewDotsButton.text = "You lost!"
            } else if (ans == "paper") {
                textviewDotsButton.text = "Draw"
            }
        }

        tryAgain.setOnClickListener {
            if(rockButton.isEnabled == false){
                rockButton.isEnabled = true
                rockButton.isClickable = true
                scissorsButton.isEnabled = true
                scissorsButton.isClickable = true
                paperButton.isEnabled = true
                paperButton.isClickable = true
                textviewDotsButton.text = "..."
            }
            else return@setOnClickListener
        }
    }
        fun init() {
            rockButton = findViewById(R.id.buttonRock)
            scissorsButton = findViewById(R.id.buttonScissors)
            paperButton = findViewById(R.id.buttonPaper)
            tryAgain = findViewById(R.id.tryy)
            textviewDotsButton = findViewById(R.id.textViewDots)
            BH = findViewById(R.id.BotHit)
            YH = findViewById(R.id.YouHit)
        }

}