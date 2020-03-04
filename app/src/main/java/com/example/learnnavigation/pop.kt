package com.example.learnnavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_pop.*
import kotlinx.android.synthetic.main.fragment_pop.view.*

/**
 * A simple [Fragment] subclass.
 */
class pop : Fragment() {
    var count = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_pop, container, false)
        view.button4.setOnClickListener {
            findNavController().navigate(R.id.pop_to_blank)
        }
        view.increase.setOnClickListener {
            textView.setText("${count++}")
        }

        return view
    }


}
