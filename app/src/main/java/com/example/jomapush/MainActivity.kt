package com.example.jomapush

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import models.DataSource
import models.ItemList
import models.ItemRecyclerAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var blogAdapter: ItemRecyclerAdapter
    private var itemList : List<ItemList> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()

    }


    fun setData (){

    }


    private fun initRecyclerView(){
        val data = DataSource.createDataSet()
        itemList = data
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        blogAdapter = ItemRecyclerAdapter(itemList)
        recyclerView.adapter = blogAdapter


    }
}