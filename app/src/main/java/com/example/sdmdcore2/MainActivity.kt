package com.example.sdmdcore2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.core2.model.Game

class MainActivity : AppCompatActivity() {

    private lateinit var game01: Game
    private lateinit var game02: Game
    private lateinit var game03: Game
    private lateinit var game04: Game

    private lateinit var tvName01: TextView
    private lateinit var tvName02: TextView
    private lateinit var tvName03: TextView
    private lateinit var tvName04: TextView

    private lateinit var tvRating01: TextView
    private lateinit var tvRating02: TextView
   private lateinit var tvRating03: TextView
    private lateinit var tvRating04: TextView

    private lateinit var imageView01: ImageView;
    lateinit var imageView02: ImageView;
    lateinit var imageView03: ImageView;
    lateinit var imageView04: ImageView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        InitializeUI()
        var mIntent = Intent(this,DisplayData::class.java)

        imageView01.setOnClickListener{
            mIntent.putExtra("game",game01)
            startActivity(mIntent)

        }
        imageView02.setOnClickListener{
            mIntent.putExtra("game",game02)
            startActivity(mIntent)

        }
        imageView03.setOnClickListener{
            mIntent.putExtra("game",game03)
            startActivity(mIntent)

        }
        imageView04.setOnClickListener{
            mIntent.putExtra("game",game04)
            startActivity(mIntent)

        }
    }

    private fun InitializeUI()
    {

        imageView01 = findViewById(R.id.image_01)
        imageView02 = findViewById(R.id.image_02)
        imageView03 = findViewById(R.id.image_03)
        imageView04 = findViewById(R.id.image_04)
        imageView01.setImageResource(R.drawable.dota);
        imageView02.setImageResource(R.drawable.cod);
        imageView03.setImageResource(R.drawable.nfs);
        imageView04.setImageResource(R.drawable.pubg);

        val date = "17/10/2021"
        game01 = Game(R.drawable.dota, "Dota", date, "PC", 5f)
        game02 = Game(R.drawable.cod, "Call Of Duty", date, "Mobile", 5f)
        game03 = Game(R.drawable.nfs, "Need For Speed", date, "PC", 3f)
        game04 = Game(R.drawable.pubg, "PUBG", date, "Mobile/PC", 4f)



    }







}