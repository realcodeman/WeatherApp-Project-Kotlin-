package com.example.andriod.weatherappkotlin.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.andriod.weatherappkotlin.R

class TodayFragment : Fragment() {

    companion object {

        fun newInstance(): TodayFragment {
            return TodayFragment()
        }
    }

    lateinit var v: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_waether_today, container, false)
        Log.d("View","Got here")
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        v.verificationPersonalInfoBtn.setOnClickListener {
//
//            parentFragmentManager.commit {
//                add(R.id.container, PasswordChangeOpenEmailFragment.newInstance())
//                addToBackStack(null)
//            }

   //     }
    }

}