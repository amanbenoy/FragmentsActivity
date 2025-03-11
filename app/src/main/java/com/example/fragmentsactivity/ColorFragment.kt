package com.example.fragmentsactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner


class ColorFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color, container, false).apply{
            findViewById<Spinner>(R.id.spinner).apply{
                adapter = ArrayAdapter(context, android.R.layout.simple_dropdown_item_1line,
                    arrayOf("Red", "Blue", "Green", "White", "Black"))
            }
        }
    }


}