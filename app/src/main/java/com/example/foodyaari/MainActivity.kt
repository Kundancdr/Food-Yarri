package com.example.foodyaari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var NavController = findNavController(R.id.fragmentContainerView2)
        var bottomnav =findViewById<BottomNavigationView>(R.id.nav_bar)
        bottomnav.setupWithNavController(NavController)
    }
}