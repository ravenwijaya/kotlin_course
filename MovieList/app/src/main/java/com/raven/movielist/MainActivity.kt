package com.raven.movielist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMovies: RecyclerView
    private var list: ArrayList<Movie> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMovies = findViewById(R.id.rv_movies)
        rvMovies.setHasFixedSize(true)
        list.addAll(MoviesData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        rvMovies.layoutManager = LinearLayoutManager(this)
        val listMovieAdapter = ListMovieAdapter(list)
        rvMovies.adapter = listMovieAdapter

        listMovieAdapter.setOnItemClickCallback(object : ListMovieAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Movie) {
               // Log.d("aw",data.name)
                showSelectedMovie(data)
            }
        })
    }
    private fun showSelectedMovie(movie: Movie) {
        Log.d("aw",movie.detail)
        val moveIntent = Intent(this, MovieActivity::class.java)
        moveIntent.putExtra(MovieActivity.KEY_MOVIE, movie)
        startActivity(moveIntent)
       // Toast.makeText(this, "Kamu memilih " + movie.name, Toast.LENGTH_SHORT).show()
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            }

        }
    }

}