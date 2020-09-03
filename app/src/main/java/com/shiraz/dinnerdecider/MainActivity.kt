package com.shiraz.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //add an ArrayList with default values { Hamburger, Pizza, Mexican, American, Chinese }
    var foodList:List<String> = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    //add new food to ArrayList
    fun addfood_click(view: View) {
        foodList+=foodtext.text.toString()
    }

    //show random food when Decide is clicked
    fun decide_click(view: View) {
        var i:Int = kotlin.random.Random.nextInt(0, foodList.size)
        foodview.text = foodList.get(i)
    }
}