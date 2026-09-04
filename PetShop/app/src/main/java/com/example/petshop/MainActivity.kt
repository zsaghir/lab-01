package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dog = Dog("Mochi", 6)
        val cat = Cat("Coco", 6)
        val scorpion = Scorpion("Stinger", 32)
        val pets = mutableListOf(cat, dog, scorpion)
        val pettablePets = mutableListOf<Pettable>(cat, dog)
        val happy = Happy("04/09/2026")
        val sad = Sad("03/09/2026")
        val mood = mutableListOf(happy,sad)

    }
}