package models

import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jomapush.R

class ItemRecyclerAdapter(private var items: List<ItemList>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        )

    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is BlogViewHolder -> {
                holder.bind(items[position])
            }
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class BlogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val blogText1: TextView = itemView.findViewById(R.id.textView1)
        private val blogText2: TextView = itemView.findViewById(R.id.textView2)
        private val blogText3: TextView = itemView.findViewById(R.id.textView3)
        private val blogText4: TextView = itemView.findViewById(R.id.textView4)

        

        fun bind(itemList: ItemList) {
            blogText1.text = itemList.title
            blogText2.text = itemList.usename
            blogText3.text = itemList.body
            blogText4.text = itemList.image
        }
    }

}
