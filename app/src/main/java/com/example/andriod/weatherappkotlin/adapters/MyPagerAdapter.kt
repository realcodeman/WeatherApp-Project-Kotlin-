package com.example.andriod.weatherappkotlin.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.andriod.weatherappkotlin.fragments.NextWeekFragment
import com.example.andriod.weatherappkotlin.fragments.TodayFragment
import com.example.andriod.weatherappkotlin.fragments.TommorowFragment

class MyPagerAdapter(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                TodayFragment.newInstance()
            }
            1 -> {
                TommorowFragment.newInstance()
            }
            2 -> {
                NextWeekFragment.newInstance()
            }
            else -> TodayFragment.newInstance()
        }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return totalTabs
    }
}