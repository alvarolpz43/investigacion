package com.example.repaso_guillermo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.repaso_guillermo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val arrayAdapter: ArrayAdapter<*>
        val personas = mutableListOf("Carlos","laura","Diego")
        val lvDatos = binding.lvDatos

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,personas)

        lvDatos.adapter = arrayAdapter
        lvDatos.setOnItemClickListener(){parent,view,position,id->
            Toast.makeText(this,parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show()
        }
    }


}