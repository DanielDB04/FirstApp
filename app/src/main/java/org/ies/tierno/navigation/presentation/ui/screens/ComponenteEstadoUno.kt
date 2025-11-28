package org.ies.tierno.navigation.presentation.ui.screens.ComponentesEstado

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstapp.R

@Composable
fun ComponenteEstadoUno() {
    // Estado para el Checkbox
    var isChecked by remember { mutableStateOf(false) }

    // Estado para la visibilidad de la imagen
    var mostrarImagen by remember { mutableStateOf(false) }

    // Primer grupo de RadioButtons
    val opciones1 = listOf("Opción 1", "Opción 2", "Opción 3")
    var selectedOption1 by remember { mutableStateOf(opciones1[0]) }

    // Segundo grupo de RadioButtons
    val opciones2 = listOf("Opción 11", "Opción 12")
    var selectedOption2 by remember { mutableStateOf(opciones2[0]) }

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            // Fila del Checkbox + texto
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Checkbox(
                    checked = isChecked,
                    onCheckedChange = { isChecked = it }
                )
                if (isChecked) {
                    Text("Checkeado")
                    Image(
                        painter = painterResource(id = R.drawable.zapatilla),
                        contentDescription = "Imagen de ejemplo"
                    )
                } else {
                    Text("No")

                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            // Si está marcado el checkbox, mostramos el botón + posiblemente la imagen
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Hola mundo 2")
                Spacer(modifier = Modifier.width(10.dp))
                Button(onClick = {}) {
                    Text("Pulsar")
                }
            }

            // Mostrar imagen solo si checkbox marcado && mostrarImagen = true

            Spacer(modifier = Modifier.height(12.dp))

            // Primer grupo de RadioButtons
            Text(text = "Selecciona entre")
            opciones1.forEach { opcion ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 2.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = (opcion == selectedOption1),
                        onClick = { selectedOption1 = opcion }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = opcion,
                        modifier = Modifier.clickable { selectedOption1 = opcion }
                    )
                }
            }
            Text(text = "Seleccionada $selectedOption1")

            Spacer(modifier = Modifier.height(12.dp))

            // Segundo grupo de RadioButtons
            Text(text = "Selecciona entre")
            opciones2.forEach { opcion ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 2.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = (opcion == selectedOption2),
                        onClick = { selectedOption2 = opcion }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = opcion,
                        modifier = Modifier.clickable { selectedOption2 = opcion }
                    )
                }
            }
            Text(text = "Seleccionada $selectedOption2")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComponenteEstadoUnoPreview() {
    ComponenteEstadoUno()
}