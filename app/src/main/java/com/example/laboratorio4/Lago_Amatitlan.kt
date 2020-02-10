package com.example.laboratorio4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_lago__amatitlan.*


class Lago_Amatitlan : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //val binding: Lago_Amatitlan = DataBindingUtil.inflate<T>(inflater, R.layout.fragment_lago__amatitlan, container, false)
        // Inflate the layout for this fragment
        return inflater.inflate(com.example.laboratorio4.R.layout.fragment_lago__amatitlan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sub_comment.setOnClickListener {
            it.findNavController().navigate(R.id.toShareComment3)
        }
    }
}
