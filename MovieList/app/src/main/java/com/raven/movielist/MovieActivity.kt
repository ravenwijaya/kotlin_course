package com.raven.movielist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MovieActivity : AppCompatActivity() {


    companion object {
        const val KEY_MOVIE = "Movie"
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)
        val actionbar = supportActionBar
        actionbar!!.title = "Movie Detail"
        actionbar.setDisplayHomeAsUpEnabled(true)

        var tvName: TextView = findViewById(R.id.tv_item_name)
        var tvDetail: TextView = findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = findViewById(R.id.img_item_photo)
        var movie= intent.getSerializableExtra(KEY_MOVIE) as Movie

        tvName.text = movie.name
        tvDetail.text = movie.detail
        Glide.with(this)
            .load(movie.bg)
            .apply(RequestOptions().override(200, 200))
            .into(imgPhoto)


    }
}