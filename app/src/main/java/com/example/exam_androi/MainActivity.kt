package com.example.exam_androi
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment
        // Instantiate the navController using the NavHostFragment
        navController = navHostFragment.navController
        println(navController)
        println("88888888888888888888888888888888888888888888")
//        // Make sure actions in the ActionBar get propagated to the NavController
//        setupActionBarWithNavController(navController)
        val bottomNav = findViewById(R.id.nav_view) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    navController.navigate(R.id.action_secondFragment_to_firstFragment)
                    true
                }
                else -> false

            }
        }
        println("88888888888888888888888888888888888888888888")
        }
    /**
     * Enables back button support. Simply navigates one element up on the stack.
     */
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}