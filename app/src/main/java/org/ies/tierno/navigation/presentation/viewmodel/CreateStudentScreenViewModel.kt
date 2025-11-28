package org.ies.tierno.navigation.presentation.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.ies.tierno.navigation.domain.model.Student

class CreateStudentScreenViewModel: ViewModel() {
    private val _student = MutableStateFlow<Student>(
        Student("","","",0
        )
    )

    // Version inmutable del estado anterior, es el estado que va a leer el UI
    val student: StateFlow<Student> = _student

    fun setNif(nif: String) {
        _student.value = _student.value.copy(nif = nif)
    }
    fun setNombre(nombre: String) {
        _student.value = _student.value.copy(nombre = nombre)
    }
    fun setApellidos(apellidos: String) {
        _student.value = _student.value.copy(apellidos = apellidos)
    }

    fun setEdad(edad: Int) {
        _student.value = _student.value.copy(edad = edad)
    }
    fun clear(){
        _student.value= Student("","","",0)
    }
    fun save() {
        // TODO Aquí va la lógica para guardar la tarea
        // Veremos qué se hace en el próximo tema
    }
}