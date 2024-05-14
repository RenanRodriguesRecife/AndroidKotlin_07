package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDola.setOnClickListener {
            val euros = binding.editEuros.text.toString().trim()
            escrever(0.8)

        }
        binding.buttonPeso.setOnClickListener {
            val euros = binding.editEuros.text.toString().trim()
            escrever(10.2)
        }
        binding.buttonReal.setOnClickListener {
            escrever(5.0)
        }
    }

    private fun escrever(d: Double) {
        val euros = binding.editEuros.text.toString().trim()

        if(!euros.isEmpty()){
            val resultado = euros.toDouble() * d
            Log.d("${resultado}","")
            Toast.makeText(applicationContext,"${resultado}$",Toast.LENGTH_SHORT).show()
        }
    }
}