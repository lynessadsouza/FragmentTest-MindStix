package com.example.fragmenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmenttest.databinding.FragmentABinding
import com.example.fragmenttest.databinding.FragmentBBinding

const val TAGFRAGMENTB= "Fragmentb"
class FragmentB : Fragment() {

    private lateinit var binding  : FragmentBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBBinding.inflate(inflater, container, false)
        binding.fragmentButtonB.setOnClickListener {
            val fragment = FragmentC()
            val transaction = fragmentManager?.beginTransaction()?.addToBackStack(null)
            transaction?.replace (R.id.nav_controller,fragment, TAGFRAGMENTB)?.commit()
        }

        return binding.root
  //      return inflater.inflate(R.layout.fragment_b, container, false)
    }


}