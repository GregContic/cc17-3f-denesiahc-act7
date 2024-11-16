package com.example.latrinidadguide

class DataRepository {
	fun getCulturalAttractions(): List<Attraction> = DataSource.culturalAttractions
    fun getOutdoorActivities(): List<Farms> = DataSource.DeFarms
    fun getDiningOptions(): List<Eats> = DataSource.RestosNCafes
    fun getShoppingExperiences(): List<Others> = DataSource.otherExperiences
}
