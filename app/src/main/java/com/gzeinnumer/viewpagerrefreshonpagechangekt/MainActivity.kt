package com.gzeinnumer.viewpagerrefreshonpagechangekt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)

        viewPagerAdapter.addFragment(FirstFragment(), "First")
        viewPagerAdapter.addFragment(SecondFragment(), "Second")

        view_pager.adapter = viewPagerAdapter
        tab_layout.setupWithViewPager(view_pager)

        view_pager.addOnPageChangeListener(object : SimpleOnPageChangeListener() {
            override fun onPageSelected(position: Int) {
                (viewPagerAdapter.getItem(position) as ViewPagerAdapter.Updateable).update()
            }
        })
    }
}