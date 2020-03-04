package com.example.learnnavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_third.view.*

/**
 * A simple [Fragment] subclass.
 */
class third : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        view.button5.setOnClickListener {
            findNavController().navigate(R.id.third_to_4)
        }

        view.button6.setOnClickListener {
            findNavController().navigate(R.id.action_third_to_main2_navigation)
        }
        return view
    }


}
