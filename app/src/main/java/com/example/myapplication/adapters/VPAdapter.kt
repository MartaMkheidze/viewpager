package com.example.myapplication.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.fragment.Fragment1
import com.example.myapplication.fragment.Fragment2
import com.example.myapplication.fragment.Fragment3

class VPAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
      return  when(position){
            0->{
                Fragment1()
            }
            1->{
                Fragment2()
            }
            2->{
                Fragment3()
            }
            else->{Fragment()}
        }
    }

}