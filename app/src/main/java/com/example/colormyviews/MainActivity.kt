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
        setListeners();
    }

    private fun setListeners(){
        val clickableViews: List<View> =
            listOf(box_one_text, box_two_text, box_3_text, box_4, box_5, constraint_layout)

        for (item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View){
        when (view.id){
            //Boxes using Color class colors
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            //Boxes using Android color resources
            R.id.box_3_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_4 -> view.setBackgroundResource(android.R.color.background_dark)
            R.id.box_5 -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
