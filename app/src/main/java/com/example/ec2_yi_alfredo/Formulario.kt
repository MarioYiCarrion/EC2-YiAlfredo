package com.example.ec2_yi_alfredo

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Formulario() {
    var favoriteDishes by remember { mutableStateOf(listOf<String>()) }
    var visitedCountries by remember { mutableStateOf(false) }
    var speaksEnglish by remember { mutableStateOf(false) }
    var likesTechnology by remember { mutableStateOf(false) }
    var doesRemoteWork by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text("1. Marque sus platos favoritos", style = MaterialTheme.typography.bodySmall)
        CheckboxList(favoriteDishes, onSelectedItemsChange = { favoriteDishes = it })

        Spacer(modifier = Modifier.height(16.dp))

        Text("2. ¿Visitaste algún país de Europa, Asia o África?", style = MaterialTheme.typography.bodySmall)
        RadioButtonGroup(selected = visitedCountries, onSelectedChange = { visitedCountries = it })

        Spacer(modifier = Modifier.height(16.dp))

        Text("3. ¿Hablas Inglés?", style = MaterialTheme.typography.bodySmall)
        RadioButtonGroup(selected = speaksEnglish, onSelectedChange = { speaksEnglish = it })

        Spacer(modifier = Modifier.height(16.dp))

        Text("4. ¿Te gusta la tecnología?", style = MaterialTheme.typography.bodySmall)
        RadioButtonGroup(selected = likesTechnology, onSelectedChange = { likesTechnology = it })

        Spacer(modifier = Modifier.height(16.dp))

        Text("5. ¿Realizas trabajo remoto?", style = MaterialTheme.typography.bodySmall)
        RadioButtonGroup(selected = doesRemoteWork, onSelectedChange = { doesRemoteWork = it })

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                println("Resolviendo formulario...")
                println("Platos favoritos: $favoriteDishes")
                println("¿Visitaste países de Europa, Asia o África?: $visitedCountries")
                println("¿Hablas Inglés?: $speaksEnglish")
                println("¿Te gusta la tecnología?: $likesTechnology")
                println("¿Realizas trabajo remoto?: $doesRemoteWork")
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("RESOLVER")
        }
    }
}


@Composable
fun CheckboxList(selectedItems: List<String>, onSelectedItemsChange: (List<String>) -> Unit) {
    val dishes = listOf(
        "Arroz con pollo",
        "Lomo Saltado",
        "Aji de gallina",
        "Tallarines",
        "Arroz Chaufa",
        "Otro"
    )

    Column {
        dishes.forEach { dish ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = selectedItems.contains(dish),
                    onCheckedChange = {
                        val newSelectedItems = if (it) {
                            selectedItems + dish
                        } else {
                            selectedItems - dish
                        }
                        onSelectedItemsChange(newSelectedItems)
                    }
                )
                Text(dish, modifier = Modifier.padding(start = 8.dp))
            }
        }
    }
}

@Composable
fun RadioButtonGroup(selected: Boolean, onSelectedChange: (Boolean) -> Unit) {
    Row {
        RadioButton(
            selected = selected,
            onClick = { onSelectedChange(true) },
            modifier = Modifier.padding(end = 8.dp)
        )
        Text("SI")

        RadioButton(
            selected = !selected,
            onClick = { onSelectedChange(false) },
            modifier = Modifier.padding(start = 16.dp)
        )
        Text("NO")
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Formulario()
}