package com.example.gymsaround.ui.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.gymsaround.model.gyms

class viewmodel:ViewModel() {
 var state by mutableStateOf(fetchGyms())

   private fun fetchGyms()=gyms

fun toggleFavorite(id:Int){
    val data =state.toMutableList()
    val item = data.indexOfFirst { it.id == id }
    data[item] = data[item].copy(isFavorite = !data[item].isFavorite)
    state = data
}


}