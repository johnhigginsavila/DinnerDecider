package com.johnhigginsmavila.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val foodList = arrayListOf("Chinese", "Ham Burger", "Pizza", "Mc Donald's", "Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            if (addFoodTxt.text.toString() != "") {
                val newFood = addFoodTxt.text.toString()
                foodList.add(newFood)
                addFoodTxt.text.clear()
            }

        }
    }
}
