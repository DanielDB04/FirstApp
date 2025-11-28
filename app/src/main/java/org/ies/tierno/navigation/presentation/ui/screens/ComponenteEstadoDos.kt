package org.ies.tierno.navigation.presentation.ui.screens.ComponentesEstado

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ComponenteEstadoDos() {
    var number1 by remember { mutableStateOf(0) }
    var number2 by remember { mutableStateOf(0) }
    var operation by remember { mutableStateOf("+") }
    val result by remember {
        derivedStateOf {
            if (operation == "+")
                number1 + number2
            else if (operation == "-")
                number1 - number2
            else if (operation == "*")
                number1 * number2
            else
                number1 / number2
        }
    }
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Row {
                Text("Numero 1")
                Spacer(modifier = Modifier.padding(16.dp))
                TextField(
                    value = number1.toString(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    onValueChange = { number1 = it.toIntOrNull() ?: number1 }
                )
            }
            Row {
                Text("Numero 2")
                Spacer(modifier = Modifier.padding(16.dp))
            TextField(
                value = number2.toString(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                onValueChange = { number2 = it.toIntOrNull() ?: number2 }
            )}

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = { operation = "+" }
                ) {
                    Text("+")
                }

                Button(
                    onClick = { operation = "-" }
                ) {
                    Text("-")
                }
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = { operation = "*" }
                ) {
                    Text("*")
                }

                Button(
                    onClick = { operation = "/" }
                ) {
                    Text("/")
                }
            }
            Text("Resultado $result")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ComponenteEstadoDosPreview() {
    ComponenteEstadoDos()
}