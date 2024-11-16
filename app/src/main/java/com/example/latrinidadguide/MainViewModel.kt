package com.example.latrinidadguide

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _categories = MutableLiveData<List<Category>>()
    val categories: LiveData<List<Category>> = _categories

    init {
        loadCategories()
    }

    private fun loadCategories() {
        val categoryList = listOf(
            Category("Farm Attractions", R.drawable.strawberry_farm),
            Category("Cultural Highlights", R.drawable.arcamuseum),
            Category("Restaurants and Cafes", R.drawable.zambali),
            Category("More", R.drawable.adivay)
        )
        _categories.value = categoryList
    }
}
