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

class welcomeScreen : Fragment() {
    lateinit var name: EditText
    lateinit var next: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        name = view.findViewById(R.id.name)
        next = view.findViewById(R.id.nextButton)

        val navController = Navigation.findNavController(view)

        next.setOnClickListener{
            val userName = name.text.toString()

            if (userName.isEmpty()){
                return@setOnClickListener
            }

            val action = welcomeScreenDirections.actionWelcomeScreenToQuestions(userName)

            navController.navigate(action)
        }
    }
}