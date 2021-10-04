package com.example.splashscreen.adapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.splashscreen.fragment.calls
import com.example.splashscreen.fragment.chats
import com.example.splashscreen.fragment.status

class ViewPagerAdaptor(fragmentManager: FragmentManager, lifecycle: Lifecycle) :FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->
            {
                chats()
            }
            1->
            {
                status()
            }
            2->{
                calls()
            }
            else->{
                Fragment()
            }
        }
    }
}