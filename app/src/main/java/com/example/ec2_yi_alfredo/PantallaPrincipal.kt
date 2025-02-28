package com.example.ec2_yi_alfredo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ec2_yi_alfredo.ui.theme.EC2Yi_AlfredoTheme

@Composable
fun PantallaPrincipal() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
        contentAlignment = Alignment.Center
    ) {

        Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center) {
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),

            ) {
                Text(text = "REGISTRO")
            }
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "FORMULARIO")
            }
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "LISTADO")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPrevie() {
    EC2Yi_AlfredoTheme {
        PantallaPrincipal()
    }
}