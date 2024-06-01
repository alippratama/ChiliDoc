package com.capstone.chilidoc.ui.profile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.capstone.chilidoc.databinding.ActivityDetailProfileBinding

class DetailProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}