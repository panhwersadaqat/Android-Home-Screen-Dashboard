package com.thefuturestic.homescreendashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thefuturestic.homescreendashboard.adapter.HomeAdapter
import com.thefuturestic.homescreendashboard.model.Item
import java.util.ArrayList

class MainActivity : AppCompatActivity() , HomeAdapter.ItemListener {
    private var recyclerView: RecyclerView? = null
    private var arrayList: ArrayList<Item>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView) as RecyclerView?
        arrayList = ArrayList<Item>()
        arrayList!!.add(Item("Sample", R.drawable.ic_about_icon, "#FFFFFF"))
        arrayList!!.add(Item("Sample", R.drawable.ic_about_icon, "#FFFFFF"))
        arrayList!!.add(Item("Sample", R.drawable.ic_about_icon, "#FFFFFF"))
        arrayList!!.add(Item("Sample", R.drawable.ic_about_icon, "#FFFFFF"))
        arrayList!!.add(Item("Sample", R.drawable.ic_about_icon, "#FFFFFF"))
        arrayList!!.add(Item("Sample", R.drawable.ic_about_icon, "#FFFFFF"))
        arrayList!!.add(Item("Sample", R.drawable.ic_about_icon, "#FFFFFF"))
        arrayList!!.add(Item("Sample", R.drawable.ic_about_icon, "#FFFFFF"))

        val adapter = HomeAdapter(this, arrayList,this)
        recyclerView!!.setAdapter(adapter)

        val manager =
                GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        recyclerView!!.setLayoutManager(manager)


    }

    //handle on item click
    override fun onItemClick(item: Item?) {

    }
}