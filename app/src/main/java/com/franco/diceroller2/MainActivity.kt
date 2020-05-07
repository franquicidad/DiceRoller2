package com.franco.diceroller2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val imageDice: ImageView =findViewById(R.id.dice_image)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button=findViewById(R.id.roll_button)


        button.setOnClickListener(){
            rolldice()

        }

    }

    private fun rolldice() {


        val randomInt=Random.nextInt(6)+1

        val imageAssign= when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        imageDice.setImageResource(imageAssign)

    }
}
