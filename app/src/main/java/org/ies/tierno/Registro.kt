package org.ies.tierno

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Registro() {
    var nombreUsuario by remember { mutableStateOf("") }
    var passwordVisible_one by remember { mutableStateOf(false) }
    var passwordVisible_two by remember { mutableStateOf(false) }
    var password by remember { mutableStateOf("") }
    var repitpassword by remember { mutableStateOf("") }
    var nombre by remember { mutableStateOf("") }
    var apellidos by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var bio by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Formulario") }
            )
        },
        bottomBar = {
            // BOTONES
            BottomAppBar {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(onClick = {
                        // Acción de aceptar
                    }) {
                        Text("Aceptar")
                    }

                    Button(onClick = {
                        // Acción de cancelar
                    }) {
                        Text("Cancelar")
                    }
                }
            }
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .padding(16.dp),
            ) {

                // CAMPO DE NOMBRE DE USUARIO
                TextField(
                    value = nombreUsuario,
                    onValueChange = { newText -> nombreUsuario = newText },
                    label = { Text("Nombre de usuario") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Person,
                            contentDescription = "Icono usuario"
                        )
                    },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp)
                )

                // CAMPO DE PASSWORD
                TextField(
                    value = password,
                    onValueChange = { newPassword -> password = newPassword },
                    label = { Text("Contraseña") },
                    visualTransformation = if (passwordVisible_one)
                        VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        val image = if (passwordVisible_one)
                            Icons.Default.Visibility else Icons.Default.VisibilityOff
                        IconButton(onClick = { passwordVisible_one = !passwordVisible_one }) {
                            Icon(imageVector = image, contentDescription = null)
                        }
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Lock,
                            contentDescription = "Icono contraseña"
                        )
                    },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 24.dp)
                )
                // CAMPO DE PASSWORD2
                TextField(
                    value = repitpassword,
                    onValueChange = { newPassword -> repitpassword = newPassword },
                    label = { Text("Repetir Contraseña") },
                    visualTransformation = if (passwordVisible_two)
                        VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        val image = if (passwordVisible_two)
                            Icons.Default.Visibility else Icons.Default.VisibilityOff
                        IconButton(
                            onClick = { passwordVisible_two = !passwordVisible_two }) {
                            Icon(imageVector = image, contentDescription = null)
                        }
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Lock,
                            contentDescription = "Icono contraseña"
                        )
                    },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 24.dp)
                )
                Row(
                    Modifier
                        .padding(1.dp)
                ) {
                    // CAMPO DE NOMBRE
                TextField(
                    value = nombre,
                    onValueChange = { newText -> nombre = newText },
                    label = { Text("Nombre") },
                    singleLine = true,
                    modifier = Modifier
                        .weight(1f)
                        .padding(2.dp)


                ) // CAMPO DE APELLIDOS
                    TextField(
                        value = apellidos,
                        onValueChange = { newText -> apellidos = newText },
                        label = { Text("Apellidos") },
                        singleLine = true,
                        modifier = Modifier
                            .weight(2f)
                            .padding(2.dp)
                    )
                }
                Spacer(modifier = Modifier.height(24.dp))
                //CORREO
                TextField(
                    value = email,
                    onValueChange = { newText -> email = newText },
                    label = { Text("Correo electrónico") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Email,
                            contentDescription = "Icono email"
                        )
                    },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 24.dp)
                )
                Spacer(modifier = Modifier.height(24.dp))
                //BIO
                TextField(
                    value = bio,
                    onValueChange = { newText -> bio = newText },
                    label = { Text("Biografía") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(bottom = 16.dp),
                    placeholder = { Text("Cuéntanos algo sobre ti...") },
                    maxLines = Int.MAX_VALUE, // 🔹 Permite múltiples líneas
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun RegistroPreview() {
    Registro()
}
