package com.example.fragmenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.fragmenttest.databinding.FragmentDBinding
import com.example.fragmenttest.databinding.FragmentEBinding


class FragmentE : Fragment() {
    private lateinit var binding  : FragmentEBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEBinding.inflate(inflater, container, false)
        binding.fragmentButtonE.setOnClickListener {
            val fragment = FragmentA()
            fragmentManager?.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_controller,fragment)?.commit()
        }

        return binding.root
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_e, container, false)
    }



}