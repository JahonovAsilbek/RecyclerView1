package uz.revolution.recyclerviewlinerlayoutmanager.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_movie.view.*
import uz.revolution.recyclerviewlinerlayoutmanager.R
import uz.revolution.recyclerviewlinerlayoutmanager.models.MyMovie

class MovieAdapter (var listMovie:ArrayList<MyMovie>): RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    inner class MyViewHolder(var itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun onBind(myMovie: MyMovie) {
            itemView.image_movie.setImageResource(myMovie.image)
            itemView.name_movie.text=myMovie.name
            itemView.view_movie.text=myMovie.view
            itemView.realise_movie.text=myMovie.realise
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(listMovie[position])
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }
}