package com.example.viewpagertablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tabs)
        val viewPager2 = findViewById<ViewPager2>(R.id.viewPager)
        val myAdapter = MyFragmentStateAdapter(this)
        viewPager2.adapter = myAdapter
        TabLayoutMediator(tabLayout,viewPager2) { tab: TabLayout.Tab, position:Int ->
            when(position){
                0-> {
                    tab.text = "CHAT"
                    tab.setIcon(R.drawable.chat)
                }
                1 -> {
                    tab.text = "STATUS"
                    tab.setIcon(R.drawable.loading)
                }
                2 -> {
                    tab.text = "CALLS"
                    tab.setIcon(R.drawable.baseline_add_call_24)
                }
            }
        }.attach()

    }
    /*TabLayoutMediator mediator to link a TabLayout with a ViewPager2.
    The mediator will synchronize the ViewPager2’s position with the selected tab when a tab is selected,
     and the TabLayout’s scroll position when the user drags the ViewPager2.
     */
}