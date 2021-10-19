package com.example.sdmdcore2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.example.core2.model.Game

class DisplayData : AppCompatActivity() {
    private lateinit var imageView: ImageView;
    private lateinit var tvName: TextView;
    private lateinit var tvType: TextView;
    private lateinit var tvDate: TextView;
    lateinit var ratingBar: RatingBar;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_data)
        imageView = findViewById(R.id.imageView)
        tvName = findViewById(R.id.etName)
        tvType = findViewById(R.id.etType)
        tvDate = findViewById(R.id.etDate)
        ratingBar = findViewById(R.id.ratingBar)

        val game = intent.getParcelableExtra<Game>("game")
        if (game != null) {
            game.image?.let { imageView.setImageResource(it) }
            tvName.setText(game.name)
            tvType.setText(game.type)
            tvDate.setText(game.date)
            ratingBar.rating = game.rating

        }
    }
}