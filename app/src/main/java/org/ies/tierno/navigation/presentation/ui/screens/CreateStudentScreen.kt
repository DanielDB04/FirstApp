package org.ies.tierno.navigation.presentation.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import org.ies.tierno.navigation.presentation.viewmodel.CreateStudentScreenViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateStudentScreen(createStudentScreen: CreateStudentScreenViewModel = viewModel()) {
    val student by createStudentScreen.student.collectAsState()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Crear Estudiante")

                }
            )
        }
    ) { innerPadding ->
        Column(Modifier.padding(innerPadding)
            .padding(12.dp)) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = student.nif,
                label = {
                    Text("DNI:")
                },
                onValueChange = {
                    createStudentScreen.setNif(it)
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = student.nombre,
                label = {
                    Text("Nombre:")
                },
                onValueChange = {
                    createStudentScreen.setNombre(it)
                }
            )
            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = student.apellidos,
                label = {
                    Text("Apellidos:")
                },
                onValueChange = {
                    createStudentScreen.setApellidos(it)
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = student.edad.toString(),
                label = {
                    Text("Edad:")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                onValueChange = { newText ->
                    createStudentScreen.setEdad(
                        if (newText.isBlank()) 0 else newText.toIntOrNull() ?: student.edad
                    )
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                OutlinedButton(
                    onClick = {
                        createStudentScreen.clear()
                    }
                ) {
                    Text("Limpiar")
                }
                Spacer(modifier = Modifier.width(16.dp))

                Button(onClick = {

                }) {
                    Text("Aceptar")
                }
            }
        }
    }
}