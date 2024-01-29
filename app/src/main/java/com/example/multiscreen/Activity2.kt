package com.example.multiscreen

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Activity2 : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val imageView = findViewById<ImageView>(R.id.imageChange)
        val textDebug = findViewById<TextView>(R.id.textView)
        val textDebug2 = findViewById<TextView>(R.id.textView2)
        if (intent.getIntExtra("imageResId",0) != 0){
            imageView.setImageResource(intent.getIntExtra("imageResId",0))
            textDebug.setText(intent.getIntExtra("imageResId",0))
            textDebug2.setText(intent.getIntExtra("imageResId",0).toString())
        }

    }

    fun onImageClick(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}