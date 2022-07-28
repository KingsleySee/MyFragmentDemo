package com.example.myfragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.myfragmentdemo.databinding.FragmentABinding


class AFragment : Fragment() {

    private lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment



        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_a, container, false)

        binding.btnToB.setOnClickListener(){
            Navigation.findNavController(binding.root)

                .navigate(R.id.action_AFragment_to_BFragment)
        }

        return binding.root
    }

}