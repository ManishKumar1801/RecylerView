package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var newRecyclerView: RecyclerView
    private  lateinit var newArrayList: ArrayList<News>
    lateinit var imageId:Array<Int>
    lateinit var heading:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        with(binding){
           imageId= arrayOf(
               R.drawable.img,
               R.drawable.img,
               R.drawable.img,
               R.drawable.img,
               R.drawable.img,
               R.drawable.img,
               R.drawable.img,
               R.drawable.img,
               R.drawable.img,
               R.drawable.img,
               R.drawable.img,
               R.drawable.img
           )
            heading= arrayOf(
                "A Day will come when i will be prime minister of india",
                "A Day will come when i will be prime minister of india",
                "A Day will come when i will be prime minister of india",
                "A Day will come when i will be prime minister of india",
                "A Day will come when i will be prime minister of india",
                "A Day will come when i will be prime minister of india",
                "A Day will come when i will be prime minister of india",
                "A Day will come when i will be prime minister of india",
                "A Day will come when i will be prime minister of india",
                "A Day will come when i will be prime minister of india",
                "A Day will come when i will be prime minister of india",
                "A Day will come when i will be prime minister of india"
            )

            newRecyclerView.layoutManager=LinearLayoutManager(this@MainActivity)

            newArrayList= arrayListOf<News>()
            getUserdata()

        }
    }

    private fun getUserdata() {
        for(i in imageId.indices){
            val news=News(imageId[i],heading[i])
            newArrayList.add(news)
        }
        newRecyclerView.adapter=MyAdapter(newArrayList)
    }
}