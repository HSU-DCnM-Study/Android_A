package com.example.android_gohome

import android.os.Bundle
import android.view.LayoutInflater
import com.example.android_gohome.common.ViewBindingActivity
import com.example.android_gohome.databinding.ActivityMainBinding

class MainActivity : ViewBindingActivity<ActivityMainBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
}