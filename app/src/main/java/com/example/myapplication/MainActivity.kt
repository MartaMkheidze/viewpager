package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.adapters.VPAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout=findViewById<TableLayout>(R.id.Tab_layout)
        val viewPager2=findViewById<ViewPager2>(R.id.view_pager2)
        val adapter=VPAdapter(supportFragmentManager, lifecycle)
        viewPager2.adapter=adapter
    }
}