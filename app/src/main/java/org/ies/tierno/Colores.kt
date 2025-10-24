package org.ies.tierno

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding

@Composable
fun Colores() {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .background(Color.Green)
                .padding(25.dp)
                .fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(Color.White)
                        .padding(16.dp)
                ) {
                    Text(text = "Hola mundo 1",
                        modifier = Modifier.border(
                            1.dp, Color.White)
                    )
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(Color.Blue)
                        .padding(16.dp)
                ) {
                    Text(text = "Hola mundo 3",
                        modifier = Modifier.border(
                            1.dp, Color.White)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(Color.Red)
                        .padding(16.dp)
                ) {
                    Text(text = "Hola mundo 2",
                        modifier = Modifier.border(
                            1.dp, Color.White)
                    )
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(Color.Yellow)
                        .padding(16.dp)
                ) {
                    Text(text = "Hola mundo 4",
                        modifier = Modifier.border(
                            1.dp, Color.White)
                    )

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ColoresPreview() {
    Colores()
}
