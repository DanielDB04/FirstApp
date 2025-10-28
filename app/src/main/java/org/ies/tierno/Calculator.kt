package org.ies.tierno

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Calculator() {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = {} ) {
                    Text("1")
                }

                Button(onClick = {} ) {
                    Text("2")
                }

                Button(onClick = {} ) {
                    Text("3")
                }
            }

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = {} ) {
                    Text("4")
                }

                Button(onClick = {} ) {
                    Text("5")
                }

                Button(onClick = {} ) {
                    Text("6")
                }
            }

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = {} ) {
                    Text("7")
                }

                Button(onClick = {} ) {
                    Text("8")
                }

                Button(onClick = {} ) {
                    Text("9")
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CalculatorPreview() {
    Calculator()
}