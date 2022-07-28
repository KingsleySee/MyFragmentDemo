package com.example.myfragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.myfragmentdemo.databinding.FragmentABinding
import com.example.myfragmentdemo.databinding.FragmentBBinding

class BFragment : Fragment() {

    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_b, container, false)

        binding.btnBack.setOnClickListener(){
            Navigation.findNavController(binding.root)
                .popBackStack()
        }

        binding.btnToC.setOnClickListener(){
            Navigation.findNavController(binding.root)

                .navigate(R.id.action_BFragment2_to_CFragment23)
        }

        return binding.root
    }


}