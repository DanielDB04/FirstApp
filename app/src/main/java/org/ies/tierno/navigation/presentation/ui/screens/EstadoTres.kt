package org.ies.tierno.navigation.presentation.ui.screens.Estado


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun EstadoTres() {
    var text by remember { mutableStateOf("") }
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Text(
                text = text,
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth()
            )
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    modifier = Modifier.weight(1f),
                    onClick = { text += "1" }
                ) {
                    Text("1")
                }

                Button(
                    modifier = Modifier.weight(1f),
                    onClick = { text += "2" }
                ) {
                    Text("2")
                }

                Button(
                    modifier = Modifier.weight(1f),
                    onClick = { text += "3" }
                ) {
                    Text("3")
                }
                Button(
                    modifier = Modifier.weight(1f),
                    onClick = { text += "+" }
                ) {
                    Text("+")
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    modifier = Modifier.weight(1f),
                    onClick = { text += "4" }
                ) {
                    Text("4")
                }

                Button(
                    modifier = Modifier.weight(1f),
                    onClick = { text += "5" }
                ) {
                    Text("5")
                }

                Button(
                    modifier = Modifier.weight(1f),
                    onClick = { text += "6" }
                ) {
                    Text("6")
                }
                Button(
                    modifier = Modifier.weight(1f),
                    onClick = { text += "-" }
                ) {
                    Text("-")
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    modifier = Modifier.weight(1f),
                    onClick = { text += "7" }
                ) {
                    Text("7")
                }

                Button(
                    modifier = Modifier.weight(1f),
                    onClick = { text += "8" }
                ) {
                    Text("8")
                }

                Button(
                    modifier = Modifier.weight(1f),
                    onClick = { text += "9" }
                ) {
                    Text("9")
                }
                Button(
                    modifier = Modifier.weight(1f),
                    onClick = {text += "*" }
                ) {
                    Text("*")
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    modifier = Modifier.weight(2f),
                    onClick = { text = "" }
                ) {
                    Text("C")
                }

                Button(
                    modifier = Modifier.weight(1f),
                    onClick = {text += "0" }
                ) {
                    Text("0")
                }

                Button(
                    modifier = Modifier.weight(1f),
                    onClick = {text += "/" }
                ) {
                    Text("/")
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun EstadoTresPreview() {
    EstadoTres()
}