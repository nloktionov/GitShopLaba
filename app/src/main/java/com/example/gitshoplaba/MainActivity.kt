package com.example.gitshoplaba

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.gitshoplaba.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.fragment_container, ())
//        fragmentTransaction.commit()
    }



}


