package com.example.animalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PetDetails2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details2)

        val petData = intent.extras
        if(petData != null) {
            var name = petData.getString("key1", "Dog")
            var age = petData.getInt("key2", 0)
            var weight = petData.getInt("key3", 0)
            var health = petData.getBoolean("key4", true)

            val textName = findViewById<TextView>(R.id.DogDetName)
            textName.text = name
            val textAge = findViewById<TextView>(R.id.DogDetAge)
            textAge.text = age.toString()
            val textWeight = findViewById<TextView>(R.id.DogDetWeight)
            textWeight.text = weight.toString()
            val textHealth = findViewById<TextView>(R.id.DogDetHealth)
            textHealth.text = health.toString()
        }
    }
}