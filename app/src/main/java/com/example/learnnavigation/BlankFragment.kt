package com.example.learnnavigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.learnnavigation.databinding.FragmentBlankBinding
import kotlinx.android.synthetic.main.fragment_blank.*


class BlankFragment : Fragment() {

    var counter = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val binding = DataBindingUtil.inflate<FragmentBlankBinding>(inflater,R.layout.fragment_blank,container,false)
        binding.button.setOnClickListener {
            val s = 4
            val action = BlankFragmentDirections.blankTo4(s)

            BlankFragmentDirections.blankTo4(4)// compiler check loi ho
           val extras = FragmentNavigatorExtras(button to "buttonTran")
            findNavController().navigate(action,extras)

        }

        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.blank_to_third)
        }

        binding.button2.setOnClickListener {
            textView9.setText("${counter++}")
        }
        return binding.root
    }


}
