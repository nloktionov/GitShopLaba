package com.example.gitshoplaba.register

import android.app.Application
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.*
import androidx.lifecycle.Observer
import com.example.gitshoplaba.database.RegisterRepository
import java.util.*

class RegisterViewModel(private val repository: RegisterRepository, application: Application): AndroidViewModel(application), Observable {

    val users =repository.users

    @Bindable
    val inputUserName = MutableLiveData<String>()

    @Bindable
    val inputFirstName = MutableLiveData<String>()

    @Bindable
    val inputLastName = MutableLiveData<String>()

    @Bindable
    val inputPassword = MutableLiveData<String>()

    @Bindable
    val inputRepeatPassword = MutableLiveData<String>()

    @Bindable
    val errorToast = MutableLiveData<Boolean>()

    fun donetoast() {

    }

    fun submitButton() {

    }

    fun signUP() {

    }


    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }
}

class RegisterViewModelFactory(
    private val repository: RegisterRepository,
    private val application: Application
): ViewModelProvider.Factory {
    @Suppress("Unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RegisterViewModel::class.java)) {
            return RegisterViewModel(repository, application) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}