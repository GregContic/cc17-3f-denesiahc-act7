package com.example.latrinidadguide

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FarmsViewModel(private val repository: DataRepository = DataRepository()) : ViewModel() {
    private val _activities = MutableLiveData<List<Farms>>()
    val activities: LiveData<List<Farms>> = _activities

    init {
        loadActivities()
    }

    private fun loadActivities() {
        _activities.value = repository.getOutdoorActivities()
    }
}
