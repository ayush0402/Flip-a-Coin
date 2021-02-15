package com.ayush.flipacoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val coinoutput = findViewById<ImageView>(R.id.coin_show)
        coinoutput.setImageResource(R.drawable.coin)

        val textout = findViewById<TextView>(R.id.text_ans)
        textout.setText("Flip?")

        val button=findViewById<Button>(R.id.button_flip)
        button.setOnClickListener{
            val randomnumber = (1..2).random()
                  if(randomnumber==1){
                      coinoutput.setImageResource(R.drawable.heads)
                    textout.setText("It's a Head") }
                else if(randomnumber==2){coinoutput.setImageResource(R.drawable.tails)
                    textout.setText("It's a Tail")}


        }
    }
}