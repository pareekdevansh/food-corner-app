package com.pareekdevansh.noobdroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pareekdevansh.noobdroid.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOrder.setOnClickListener {
            binding.tvDrinks.text = when {
                binding.rbCoffee.isChecked ->
                    "Coffee 15/-"

                binding.rbTea.isChecked ->
                    "Tea 10/-"

                binding.rbMilk.isChecked ->
                    "Milk 20/-"

                binding.rbLemonade.isChecked ->
                    "Lemonade 12/-"
                else -> getString(R.string.request)

            }

                binding.tvFood.text = when {
                    binding.cbNamkeen.isChecked and binding.cbBiscuits.isChecked -> "Biscuits 20/-\nNamkeen 35/-"
                    binding.cbBiscuits.isChecked -> "Biscuits 20/-"
                    binding.cbNamkeen.isChecked -> "Namkeen 35/-"
                    binding.tvDrinks != null -> ""
                    else -> getString(R.string.request)
                }

            }


        }
    }