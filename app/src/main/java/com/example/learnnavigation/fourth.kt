package com.example.learnnavigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.transition.TransitionInflater

/**
 * A simple [Fragment] subclass.
 */
class fourth : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val safeArgs: fourthArgs by navArgs()
        Toast.makeText(activity,safeArgs.someInt.toString(),Toast.LENGTH_SHORT).show()
        sharedElementEnterTransition = TransitionInflater.from(context).inflateTransition(android.R.transition.move)


    return inflater.inflate(R.layout.fragment_fourth, container, false)
    }


}
