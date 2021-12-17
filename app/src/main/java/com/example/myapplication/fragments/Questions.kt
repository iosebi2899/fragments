package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation
import com.example.myapplication.R

class Questions : Fragment(R.layout.fragment_questions) {

    lateinit var age: EditText
    lateinit var next: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        age = view.findViewById(R.id.age)
        next = view.findViewById(R.id.nextButton)

        val name = QuestionsArgs.fromBundle(requireArguments()).name

        val navController = Navigation.findNavController(view)

        next.setOnClickListener{
            val userAge = age.text.toString()

            if (userAge.isEmpty()){
                return@setOnClickListener
            }

            val action = QuestionsDirections.actionQuestionsToResult(name, userAge)

            navController.navigate(action)

        }
    }

}