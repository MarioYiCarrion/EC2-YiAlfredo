package com.example.ec2_yi_alfredo

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class Test(
    val title: String,
    val description: String,
    val publicationDate: String
)

@Composable
fun Listado() {
    // Lista de tests psicológicos
    val psychologicalTests = listOf(
        Test("Test de Rorschach",
            "Creado por Hermann Rorschach, este test utiliza manchas de tinta para evaluar la percepción y la personalidad",
            "1921"),
        Test("Inventario Multifásico de Personalidad de Minnesota (MMPI)",
            "Desarrollado en 1943 por Hathaway y McKinley, es uno de los test de personalidad más utilizados en psicología clínica.",
            "1943"),
        Test("Test de Bender",
            "Creado por Lauretta Bender, se utiliza para evaluar el desarrollo neuropsicológico en niños y adultos",
            "1938"),
        Test("Escala de Inteligencia Wechsler para Adultos",
            "Desarrollada por David Wechsler en 1955, es una prueba de inteligencia utilizada principalmente con adultos",
            "1955"),
        Test("Inventario de Depresión de Beck",
            "Creado por Aaron T. Beck en 1961, es una prueba autoadministrada para evaluar la gravedad de la depresión en adultos y adolescentes.",
            "1961"),
        Test("Escala de Actitudes hacia el Alcohol y el Alcoholismo ",
            "Desarrollada en 1977 por Donald S. Macdonald, evalúa las actitudes hacia el alcohol y el riesgo de alcoholismo.",
            "1977"),
        Test("Inventario de Ansiedad Estado-Rasgo",
            "Creado por Charles D. Spielberger en 1970, evalúa los niveles de ansiedad en adultos.",
            "1970"),
        Test("Escala de Evaluación de la Personalidad de Eysenck",
            "Desarrollada por Hans Eysenck y Sybil B. G. Eysenck en 1953, evalúa los rasgos de personalidad.",
            "1953"),
        Test("Inventario Clínico Multiaxial de Millon",
            "Desarrollado por Theodore Millon en 1977, es utilizado para evaluar trastornos de la personalidad y síntomas clínicos.",
            "1977"),
        Test("Test de Apercepción Temática",
            "Desarrollado por Christiana D. Morgan y Henry A. Murray en la década de 1930, se utiliza para evaluar aspectos de la personalidad a través de interpretaciones de imágenes ambiguas.",
            "1930")
    )

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {

        LazyColumn {
            items(psychologicalTests) { test ->
                PsychologicalTestCard(test)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {

                println("Resolviendo formulario...")

            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("RESOLVER")
        }
    }
}

@Composable
fun PsychologicalTestCard(test: Test) {
    Card(
        elevation = CardDefaults.cardElevation(),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = test.title, style = MaterialTheme.typography.bodySmall)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = test.description, style = MaterialTheme.typography.bodySmall)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Publicado el ${test.publicationDate}", style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPrevi() {
    Listado()
}

