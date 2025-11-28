package org.ies.tierno.navigation.domain.model

data class Flight(
    val number :Int,
    val origin:String,
    val destination: String,
    val company: String
) {}