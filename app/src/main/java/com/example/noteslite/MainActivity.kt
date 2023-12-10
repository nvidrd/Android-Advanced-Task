package com.example.noteslite

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.noteslite.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("Notedata", Context.MODE_PRIVATE)

        binding.btnSimpan.setOnClickListener{
            val note = binding.editNotes.text.toString()
            val shareEdit = sharedPreferences.edit()
            shareEdit.putString("note", note)
            shareEdit.apply()
            Toast.makeText(this, "Sukses", Toast.LENGTH_SHORT).show()
            binding.editNotes.text.clear()
        }
        binding.btnDisplay.setOnClickListener{
            val storeNote = sharedPreferences.getString("note", "")
            binding.tvNotes.text = "$storeNote"
        }
    }
}