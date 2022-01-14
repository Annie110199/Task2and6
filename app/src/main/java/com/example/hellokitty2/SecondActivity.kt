package com.example.hellokitty2

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.hellokitty2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var user = "ЖЫвотное"
        var gift = "дырку от бублика"

        user = intent.extras?.getString("username").toString()
        gift = intent.extras?.getString("gift").toString()

        val textview_second_info: TextView = findViewById(R.id.textview_second_info)
        textview_second_info.text = user + " , вам передали " + gift
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_second)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}