package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.parques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val TAG="info"

        binding.btSave.setOnClickListener {
       /*     Log.d(TAG, "El parque es ${binding.name.text}")
            Log.d(TAG, "Su descripción: ${binding.description.text}")
            Log.d(TAG, "Télefono: ${binding.phone.text}")
            Log.d(TAG, "Página Web: ${binding.website.text}")
            Log.d(TAG, "Horario apertura: ${binding.spinnerOpening.selectedItem}")
            Log.d(TAG, "Horario cierre: ${binding.sipinnerClosing.selectedItem}")
            if(binding.CbPark.isChecked){
                Log.d(TAG, "El parque cuenta con parque infantil")
            }
            if(binding.CbSports.isChecked){
                Log.d(TAG, "El parque cuenta con la actividad deportes")
            }
            if(binding.CbPets.isChecked){
                Log.d(TAG, "El parque cuenta con zona mascotas")
            }
            if(binding.CbRestaurant.isChecked){
                Log.d(TAG, "El parque cuenta con restaurante")
            }*/
            val miDialogo = MiDialogFragment()
            miDialogo.show(supportFragmentManager,"MiDialogo")
        }



    }
}