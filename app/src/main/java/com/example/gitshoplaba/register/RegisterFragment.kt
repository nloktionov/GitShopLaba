package com.example.gitshoplaba.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gitshoplaba.R

class RegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register, container, false)
        val toLoginButton = view.findViewById<TextView>(R.id.toLoginButton)
        toLoginButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentRegister_to_fragmentLogin)
        }
        return view
    }
}