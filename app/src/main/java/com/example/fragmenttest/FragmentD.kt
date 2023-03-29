package com.example.fragmenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.fragmenttest.databinding.FragmentCBinding
import com.example.fragmenttest.databinding.FragmentDBinding
const val TAGFRAGMENTD= "Fragmentd"
class FragmentD : Fragment() {
    private lateinit var binding  : FragmentDBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDBinding.inflate(inflater, container, false)
        binding.fragmentButtonD.setOnClickListener {
            val fragment = FragmentE()

       //    val transaction =
            //    fragmentManager?.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
         //   transaction.

            val trans= fragmentManager?.beginTransaction()?.addToBackStack(null)
            trans?.replace(R.id.nav_controller,fragment,TAGFRAGMENTD)?.commit()

        }

        return binding.root
        // Inflate the layout for this fragment
      //  return inflater.inflate(R.layout.fragment_d, container, false)
    }


}