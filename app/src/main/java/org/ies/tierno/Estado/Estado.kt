package org.ies.tierno.Estado

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@Composable
fun Estado() {
    var textFieldValue by remember { mutableStateOf("") }

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            TextField(
                value = textFieldValue,
                onValueChange = { newText -> textFieldValue = newText },
                label = { Text("Introduce algo") },
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = textFieldValue,
                modifier = Modifier.padding(bottom = 16.dp)
                    .background(Color.Black)
                    .fillMaxWidth(),
                    Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EstadoPreview() {
    Estado()
}