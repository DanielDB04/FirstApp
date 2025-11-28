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
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateFlightScreen(createFlightViewModel: CreateFlightScreenViewModel = viewModel()) {
    val flight by createFlightViewModel.flight.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Crear vuelo")

                }
            )
        }
    ) { innerPadding ->
        Column(Modifier.padding(innerPadding)
            .padding(12.dp)) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = flight.number.toString(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                onValueChange = { newText ->
                    createFlightViewModel.setNumber(
                        if (newText.isBlank()) 0 else newText.toIntOrNull() ?: flight.number
                    )
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = flight.origin,
                label = {
                    Text("Origen:")
                },
                onValueChange = {
                    createFlightViewModel.setorigin(it)
                }
            )
            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = flight.destination,
                label = {
                    Text("Destino:")
                },
                onValueChange = {
                    createFlightViewModel.setDestination(it)
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = flight.company,
                label = {
                    Text("Compañia:")
                },
                onValueChange = {
                    createFlightViewModel.setCompany(it)
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                OutlinedButton(
                    onClick = {
                        createFlightViewModel.clear()
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

@Preview(showBackground = true)
@Composable
fun CreateFlightScreenPreview() {
    CreateFlightScreen()
}