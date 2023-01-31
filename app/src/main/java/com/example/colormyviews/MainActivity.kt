package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener();
    }
    private fun setListener(){
        val clickableViews: List<Int> =
            listOf(R.id.box_one_text, R.id.box_two_text, R.id.box_three_text,
                R.id.box_four_text, R.id.box_five_text,R.id.constraint, R.id.button1, R.id.button2, R.id.button3 )

        for(item in clickableViews){
            findViewById<View>(item).setOnClickListener{ makeColored(it) }
        }
    }
    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundResource(android.R.color.holo_blue_light)
            R.id.box_two_text -> view.setBackgroundResource(android.R.color.holo_green_dark)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_red_dark)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.darker_gray)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.button1 -> box_three_text.setBackgroundResource(R.color.purple_200)
            R.id.button2 -> box_four_text.setBackgroundResource(R.color.teal_200)
            R.id.button3 -> box_five_text.setBackgroundResource(androidx.appcompat.R.color.material_blue_grey_800)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}