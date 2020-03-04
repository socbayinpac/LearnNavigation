package com.example.learnnavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_five.view.*

/**
 * A simple [Fragment] subclass.
 */
class Five : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_five, container, false)
        view.button7.setOnClickListener {
            findNavController().navigate(R.id.action_five_to_six)
        }
        return view
    }


}
