package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R

class result : Fragment() {
        lateinit var nameTextView: TextView
        lateinit var ageTextView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nameTextView = view.findViewById(R.id.nameText)
        ageTextView = view.findViewById(R.id.ageView)

        val name = resultArgs.fromBundle(requireArguments()).name.toString()
        val age = resultArgs.fromBundle(requireArguments()).userAge.toString()

        nameTextView.text = name + "შენი ასაკი ძაღლების ასაკით არის"
        ageTextView.text = age + "წელი"

    }
}