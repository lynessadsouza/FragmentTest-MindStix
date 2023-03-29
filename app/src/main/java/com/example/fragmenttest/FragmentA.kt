package com.example.fragmenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmenttest.databinding.FragmentABinding

class FragmentA : Fragment() {
private lateinit var binding  : FragmentABinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
 }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentABinding.inflate(inflater, container, false)
        binding.fragmentButtonA.setOnClickListener {
val fragment = FragmentB()
            val transaction = fragmentManager?.beginTransaction()?.addToBackStack("FragmentA")
            transaction?.replace(R.id.nav_controller,fragment)?.commit()
        }

        return binding.root
    }


}