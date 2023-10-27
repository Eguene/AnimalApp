package com.example.animalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PetDetails3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details3)

        val petData = intent.extras
        if (petData != null) {
            var name = petData.getString("key1", "Birb")
            var age = petData.getInt("key2", 0)
            var weight = petData.getInt("key3", 0)
            var health = petData.getBoolean("key4", true)

            val textName = findViewById<TextView>(R.id.BirbDetName)
            textName.text = name
            val textAge = findViewById<TextView>(R.id.BirbDetAge)
            textAge.text = age.toString()
            val textWeight = findViewById<TextView>(R.id.BirbDetWeight)
            textWeight.text = weight.toString()
            val textHealth = findViewById<TextView>(R.id.BirbDetHealth)
            textHealth.text = health.toString()
        }
    }
}