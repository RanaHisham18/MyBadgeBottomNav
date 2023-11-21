package com.example.mybottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mybottomnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
       binding.bottomNavigation.getMenu().findItem(R.id.page_1)
        var badge = binding.bottomNavigation.getOrCreateBadge(R.id.page_1)
        badge.isVisible = true
        badge.number = 1

    }
}