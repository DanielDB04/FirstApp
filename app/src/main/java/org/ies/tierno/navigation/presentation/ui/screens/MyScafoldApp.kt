package org.ies.tierno.navigation.presentation.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.sharp.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyScaffoldApp() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Scaffold con FAB") },
                navigationIcon = {
                    IconButton(onClick = { /* Acción de icono de navegación */ }) {
                        Icon(Icons.Default.Menu, contentDescription = "Menú")
                    }
                },
                actions = {
                    IconButton(onClick = { /* Acción de buscar */ }) {
                        Icon(Icons.Default.Search, contentDescription = "Buscar")
                    }

                    IconButton(onClick = { /* Acción de buscar */ }) {
                        Icon(Icons.Default.AccountBox, contentDescription = "Buscar")
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* Acción del FAB */ }) {
                Icon(
                    Icons.Sharp.Person,
                    contentDescription = "Agregar"
                )
            }
        },
        floatingActionButtonPosition = FabPosition.End, // Posición del FAB (End, Center)
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {

                Image(
                    painter = painterResource(R.drawable.images),
                    contentDescription = "Linux",
                    modifier = Modifier.align (Alignment.CenterHorizontally)
                )
                Text(
                    text = "Este es el contenido principal de la pantalla",
                )

                var text by remember { mutableStateOf("") }

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = text,
                    onValueChange = { text = it },
                    label = {
                        Row (
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = "Username"
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Username")
                        }
                    },
                    placeholder = {
                        Row {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = "Username"
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Username")

                        }
                    }
                )
            }

        }
    )
}

@Preview(showBackground = true)
@Composable
fun MyScaffoldAppPreview() {
    MyScaffoldApp()
}