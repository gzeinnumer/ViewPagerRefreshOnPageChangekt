package com.gzeinnumer.viewpagerrefreshonpagechangekt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment


class SecondFragment : Fragment(), ViewPagerAdapter.Updateable {

    override fun update() {
        Toast.makeText(requireContext(), "Update Here 2", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }
}