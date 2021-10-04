package com.example.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.splashscreen.adapter.ViewPagerAdaptor
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tableLayout: TabLayout =findViewById(R.id.tab_layout)
        val viewPager2: ViewPager2 =findViewById(R.id.view_pager_2)
        val adapter= ViewPagerAdaptor(supportFragmentManager,lifecycle)
        viewPager2.adapter=adapter
        TabLayoutMediator(tableLayout,viewPager2){
                tab,position->

            when(position){
                0->tab.text="Welcome"
                1->tab.text="Status"
                2->tab.text="Calls"
            }
        }.attach()

    }
}
