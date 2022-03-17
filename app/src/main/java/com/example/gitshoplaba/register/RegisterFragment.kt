package com.example.gitshoplaba.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.gitshoplaba.R
import com.example.gitshoplaba.database.RegisterDatabase
import com.example.gitshoplaba.database.RegisterRepository
import com.example.gitshoplaba.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {
    private lateinit var registerViewModel: RegisterViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentRegisterBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_register, container, false
        )

        val application = requireNotNull(this.activity).application

        val dao = RegisterDatabase.getInstance(application).registerDatabaseDao

        val repository = RegisterRepository(dao)

        val factory = RegisterViewModelFactory(repository, application)

        registerViewModel = ViewModelProvider(this, factory).get(RegisterViewModel::class.java)

        binding.myRegisterViewModel = registerViewModel

        binding.lifecycleOwner = this

        registerViewModel.errorToast.observe(this, Observer { hasError->
            if(hasError==true){
                Toast.makeText(requireContext(), "Ебанат, заполни все поля", Toast.LENGTH_SHORT).show()
                registerViewModel.donetoast()
            }
        })

        registerViewModel.errorToastUsername.observe(this, Observer { hasError->
            if(hasError==true){
                Toast.makeText(requireContext(), "Этот телефон уже занят, уеба", Toast.LENGTH_SHORT).show()
                registerViewModel.donetoastUserName()
            }
        })

        return binding.root
    }



    private fun displayUsersList() {

    }
}