package com.example.pam_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pam_2.ui.theme.PAM_2Theme
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.example.pam_2.ui.theme.Pink10
import com.example.pam_2.ui.theme.Purple40
import com.example.pam_2.ui.theme.PurpleGrey40
import com.example.pam_2.ui.theme.White10

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Chama o projeto
        setContent {
            PAM_2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // Aplicando o InnerPadding
                        ProdutoItem()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProdutoItem() {

    var nome by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    var curso by remember { mutableStateOf("") }
    var serie by remember { mutableStateOf("") }


    Column(
        Modifier
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .height(100.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Pink10, Purple40
                        )
                    )
                )
                .fillMaxWidth()
        )

        {
            Image(
                painter = painterResource(id = R.drawable.usuario1),
                contentDescription = "Descrição da imagem",
                modifier = Modifier
                    .offset(y = (50).dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.BottomCenter)
            )
        }
        Spacer(modifier = Modifier.height(50.dp))

        // Dessa forma o modifier.padding servirá para todos os componentes dentro da coluna
        Column (Modifier.padding(16.dp))
        {
            Text(
                text = "Insira seus dados:",
                fontSize = 16.sp, fontWeight = FontWeight(700),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Row (
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ){ }
            Row (
                Modifier
                    .fillMaxWidth(),
                Arrangement.Center
            ) {
                OutlinedTextField(
                    value = nome,
                    onValueChange = { nome = it },
                    singleLine = true,

                    label = { Text(text = "Nome:") }

                )
            }

            Row (
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ){ }

            Row (
                Modifier
                    .fillMaxWidth(),
                Arrangement.Center
            ) {
                OutlinedTextField(
                    value = telefone,
                    onValueChange = { telefone = it },

                    // Label dentro do OutlinedTextField, acima do campo
                    label = { Text(text = "Telefone:") }
                )
            }
            Row (
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ){ }

            Row (
                Modifier
                    .fillMaxWidth(),
                Arrangement.Center
            ) {
                OutlinedTextField(
                    value = curso,
                    onValueChange = { curso = it },

                    // Label dentro do OutlinedTextField, acima do campo
                    label = { Text(text = "Curso:") }
                )
            }
            Row (
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ){ }

            Row (
                Modifier
                    .fillMaxWidth(),
                Arrangement.Center
            ) {
                OutlinedTextField(
                    value = serie,
                    onValueChange = { serie = it },

                    // Label dentro do OutlinedTextField, acima do campo
                    label = { Text(text = "Série:") }
                )
            }

            Row (
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ){ }

            Row (
                Modifier
                    .fillMaxWidth(),
                Arrangement.Center
            ) {

                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFAE89D0))
                ) {
                    Text(text = "Enviar")
                }
            }
        }
    }
}