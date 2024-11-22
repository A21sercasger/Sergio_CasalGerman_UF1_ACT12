package com.example.sergio_casalgerman_uf1_act12

import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scrollView = findViewById<android.widget.HorizontalScrollView>(R.id.horizontalScrollView)
        val toggleSwitch = findViewById<Switch>(R.id.toggleScroll)

        toggleSwitch.setOnCheckedChangeListener { _, isChecked ->
            // Mostra o amaga les línies de desplaçament segons l'estat del toggle
            scrollView.isHorizontalScrollBarEnabled = isChecked
        }
    }
}