package com.example.viewpagertablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagertablayout.Fragments.BlankFragment
import com.example.viewpagertablayout.Fragments.CallsFragment
import com.example.viewpagertablayout.Fragments.FragmentFive
import com.example.viewpagertablayout.Fragments.StatusFragment
import com.example.viewpagertablayout.Fragments.fragmentfour

class MyFragmentAdapter2(fragmentActivity: FragmentActivity):
    FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
       return when (position){
            0 -> BlankFragment()
            1 -> StatusFragment()
            2 -> CallsFragment()
            3 -> fragmentfour()
            4 -> FragmentFive()
            else
                -> BlankFragment()
        }
    }

}

