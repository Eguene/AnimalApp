package com.example.animalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.jar.Attributes.Name

class PetDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val petData = intent.extras
        if(petData != null) {
            var name = petData.getString("key1", "Cat")
            var age = petData.getInt("key2", 0)
            var weight = petData.getInt("key3", 0)
            var health = petData.getBoolean("key4", true)

           val textName = findViewById<TextView>(R.id.CatDetName)
            textName.text = name
            val textAge = findViewById<TextView>(R.id.CatDetAge)
            textAge.text = age.toString()
            val textWeight = findViewById<TextView>(R.id.CatDetWeight)
            textWeight.text = weight.toString()
            val textHealth = findViewById<TextView>(R.id.CatDetHealth)
            textHealth.text = health.toString()
        }
    }
}