package io.github.rosariopfernandes.alcandroidchallenge1

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        findViewById<Button>(R.id.btnAbout)
            .setOnClickListener {
                val intentA = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intentA)
            }

        findViewById<Button>(R.id.btnProfile)
            .setOnClickListener {
                val intentB = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(intentB)
            }
    }
}
