package io.github.rosariopfernandes.alcandroidchallenge1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val imageView = findViewById<ImageView>(R.id.imageView)

        Glide.with(imageView)
            .load("https://avatars3.githubusercontent.com/u/16766726?s=460&v=4")
            .apply(RequestOptions.circleCropTransform())
            .into(imageView )
    }
}
