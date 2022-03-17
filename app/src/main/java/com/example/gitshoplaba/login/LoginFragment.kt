package com.example.gitshoplaba.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.gitshoplaba.R
import com.example.gitshoplaba.database.RegisterDatabase
import com.example.gitshoplaba.database.RegisterRepository
import com.example.gitshoplaba.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var loginViewModel: LoginViewModel
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
//            inflater,
//            R.layout.fragment_login, container, false
//        )
//
//        val application = requireNotNull(this.activity).application
//
//        val dao = RegisterDatabase.getInstance(application)
////
////        val repository = RegisterRepository(dao)
////
////        val factory = LoginViewModelFactory(repository, application)
////
////        loginViewModel = ViewModelProvider(this, factory).get(LoginViewModel::class.java)
////
////        binding.myLoginViewModel = loginViewModel
////
////        binding.lifecycleOwner = this
//
//        return binding.root
//    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val toRegistrationButton = view.findViewById<TextView>(R.id.toRegistrationButton)
        toRegistrationButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentLogin_to_fragmentRegister)
        }
        return view
    }
}