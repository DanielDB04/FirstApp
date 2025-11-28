package org.ies.tierno.navigation.presentation.ui.screens


import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.ies.tierno.navigation.domain.model.Flight

class CreateFlightScreenViewModel: ViewModel() {
    private val _flight = MutableStateFlow<Flight>(
        Flight(
            0, "", "", ""
        )
    )

    // Version inmutable del estado anterior, es el estado que va a leer el UI
    val flight: StateFlow<Flight> = _flight

    fun setNumber(number: Int) {
        _flight.value = _flight.value.copy(number = number)
    }
    fun setorigin(origin: String) {
        _flight.value = _flight.value.copy(origin = origin)
    }
    fun setDestination(destination: String) {
        _flight.value = _flight.value.copy(destination = destination)
    }

    fun setCompany(company: String) {
        _flight.value = _flight.value.copy(company = company)
    }
    fun clear(){
        _flight.value= Flight(0,"","","")
    }
    fun save() {
        // TODO Aquí va la lógica para guardar la tarea
        // Veremos qué se hace en el próximo tema
    }
}