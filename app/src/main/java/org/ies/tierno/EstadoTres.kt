package org.ies.tierno

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
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
    var textResult by remember { mutableStateOf("")}
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("textResult") },
                modifier = Modifier.background(Color.Blue)
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text("1")
                }

                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text("2")
                }

                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text("3")
                }
                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text("+")
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text("4")
                }

                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text("5")
                }

                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text("6")
                }
                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text("-")
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text("7")
                }

                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text("8")
                }

                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text("9")
                }
                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text("*")
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f)
                ) {
                    Text("c")
                }

                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text("0")
                }

                Button(
                    onClick = {}, modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text("/")
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewEstadoTres() {
    EstadoTres()
}