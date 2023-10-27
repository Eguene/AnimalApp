package com.example.animalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tom = Cat("Tom", 83, 5, true)
        val jack = Dog("Jack", 13, 15, false)
        val jay = Birb("Jay", 2, 1, true)

        val btnCat = findViewById<Button>(R.id.btnPet1)
        btnCat.setOnClickListener{
            val bundle = Bundle()

            bundle.putString("key1", tom.name)
            bundle.putInt("key2", tom.age)
            bundle.putInt("key3", tom.weight)
            bundle.putBoolean("key4", tom.isHealthy)

            val intent = Intent(this@MainActivity, PetDetails::class.java)
            intent.putExtras(bundle)

            startActivity(intent)
        }

        val btnDog = findViewById<Button>(R.id.btnPet2)
        btnDog.setOnClickListener{
            val bundle = Bundle()

            bundle.putString("key1", jack.name)
            bundle.putInt("key2", jack.age)
            bundle.putInt("key3", jack.weight)
            bundle.putBoolean("key4", jack.isHealthy)

            val intent = Intent(this@MainActivity, PetDetails2::class.java)
            intent.putExtras(bundle)

            startActivity(intent)
        }

        val btnBirb = findViewById<Button>(R.id.btnPet3)
        btnBirb.setOnClickListener{
            val bundle = Bundle()

            bundle.putString("key1", jay.name)
            bundle.putInt("key2", jay.age)
            bundle.putInt("key3", jay.weight)
            bundle.putBoolean("key4", jay.isHealthy)

            val intent = Intent(this@MainActivity, PetDetails3::class.java)
            intent.putExtras(bundle)

            startActivity(intent)
        }


        val CatName = findViewById<TextView>(R.id.tvPetName1)
        CatName.text = tom.name
        val CatDesc = findViewById<TextView>(R.id.tvPetDesc1)
        CatDesc.text = "This is a cat"

        val DogName = findViewById<TextView>(R.id.tvPetName2)
        DogName.text = jack.name
        val DogDesc = findViewById<TextView>(R.id.tvPetDesc2)
        DogDesc.text = "This is a dog"

        val BirdName = findViewById<TextView>(R.id.tvPetName3)
        BirdName.text = jay.name
        val BirdDesc = findViewById<TextView>(R.id.tvPetDesc3)
        BirdDesc.text = "This is a bird"
    }
}