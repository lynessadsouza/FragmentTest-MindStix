package com.example.fragmenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmenttest.databinding.FragmentBBinding
import com.example.fragmenttest.databinding.FragmentCBinding

const val TAGFRAGMENTC = "Fragmentc"

class FragmentC : Fragment() {
    private lateinit var binding: FragmentCBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCBinding.inflate(inflater, container, false)
        binding.fragmentButtonC.setOnClickListener {
            val fragment = FragmentD()
            val transaction = fragmentManager?.beginTransaction()?.addToBackStack(null)
            transaction?.replace(R.id.nav_controller, fragment, TAGFRAGMENTC)?.commit()
        }
        return binding.root

    }
}