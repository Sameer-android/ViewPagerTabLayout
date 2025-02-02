package com.example.viewpagertablayout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagertablayout.databinding.ActivityMain2Binding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        val tabLayout = findViewById<TabLayout>(R.id.tab)
//        val viewPager2 = findViewById<ViewPager2>(R.id.viewPager2)
//        val myAdapter = MyFragmentAdapter2(this)
//        viewPager2.adapter = myAdapter

//        TabLayoutMediator(tabLayout,viewPager2){
//            tab:TabLayout.Tab,position:Int ->
//            when (position){
//                0 -> {
//                    tab.text = "CHAT"
//                    tab.setIcon(R.drawable.chat)
//                }
//                1 -> {
//                    tab.text = "STATUS"
//                    tab.setIcon(R.drawable.loading)
//                }
//                2 -> {
//                    tab.text = "CALLS"
//                    tab.setIcon(R.drawable.baseline_add_call_24)
//                }
//                3 -> {
//                    tab.text = "DELETE"
//                    tab.setIcon(R.drawable.baseline_add_home_work_24)
//                }
//                4 -> {
//                    tab.text = "RECYCLER VIEW"
//                    tab.setIcon(R.drawable.baseline_add_shopping_cart_24)
//                }
//            }
//
//
//        }.attach()
        val myAdapter = MyFragmentAdapter2(this)
        binding.viewpager.adapter = myAdapter

        TabLayoutMediator(binding.tablayout,binding.viewpager){
            tab:TabLayout.Tab, position:Int ->
            when (position) {
                0 -> {
                    tab.text = "CHATS"
                }
                1 -> {
                    tab.text = "STATUS"
                }
                2 -> {
                    tab.text = "CALLS"
                }
                3 -> {
                    tab.text = "DELETE"
                }
               4 -> {
                   tab.text = "RECYCLER VIEW"
               }

            }
        }.attach()
    }
}