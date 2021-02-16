package uz.revolution.recyclerviewlinerlayoutmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import uz.revolution.recyclerviewlinerlayoutmanager.adapters.MovieAdapter
import uz.revolution.recyclerviewlinerlayoutmanager.models.MyMovie

class MainActivity : AppCompatActivity() {

    var movieList:ArrayList<MyMovie>?=null
    lateinit var adapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
        adapter = MovieAdapter(movieList!!)
        rv.layoutManager=LinearLayoutManager(this)
        rv.adapter=adapter

    }

    private fun loadData() {
        movieList = ArrayList()

        for (i in 0..100) {
            movieList?.add(MyMovie(R.drawable.captain, "Captain America", "500K", "2018"))
            movieList?.add(MyMovie(R.drawable.titanic, "Titanik", "1.2M", "2009"))
            movieList?.add(MyMovie(R.drawable.legend, "I am Legend", "500K", "2009"))
            movieList?.add(MyMovie(R.drawable.wick, "John Wick", "250K", "2016"))
            movieList?.add(MyMovie(R.drawable.fast, "Fast and Furious", "700K", "2018"))
            movieList?.add(MyMovie(R.drawable.matrix, "The Matrix", "200M", "2002"))
        }

    }
}