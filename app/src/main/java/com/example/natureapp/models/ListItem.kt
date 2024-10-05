package com.example.natureapp.models

class ListItem ( val name : String, val descripcion : String, val img : String){
    companion object{
        val items = listOf(
            ListItem(
                "Cataratas de Iguazú",
                "Una de las «Siete Maravillas Naturales del Mundo», se encuentran en la provincia argentina de Misiones. Está formada por 275 saltos, su mayor salto es de 80 metros." ,
                "https://losviajesdedomi.com/wp-content/uploads/2021/09/cataratas-del-iguazu-1-1-1.jpg"),
            ListItem(
                "Salto de Ángel",
                "Se localiza en Parque Nacional Canaima en el estado de Bolívar (Venezuela). Es el salto de agua más alto del mundo con una altura de 979 metros.",
                "https://losviajesdedomi.com/wp-content/uploads/2021/09/salto-del-angel-1-1.jpg"),
            ListItem(
                "Monte Roraime",
                "Es el punto más alto de la cadena de meseta Tepuyes situada en Venezuela, sobresale a más de mil metros sobre la boscosidad del parque.",
                "https://losviajesdedomi.com/wp-content/uploads/2021/09/roraima-1-1.jpg"),
            ListItem(
                "Halong Bay",
                "Extensión de agua de aproximadamente 1.500 km² situada al norte de Vietnam. Elementos kársticos e islas de varios tamaños y formas.",
                "https://losviajesdedomi.com/wp-content/uploads/2021/09/halong-bay-1-1.jpg"),
            ListItem(
                "Lagos Plitvice",
                "Tiene 16 pequeños lagos entrelazados entre ellos con cascadas,forma parte del Patrimonio de la Humanidad de la Unesco.",
                "https://losviajesdedomi.com/wp-content/uploads/2021/09/plitvice-lakes-1-1.jpg")
        )
    }
}