package com.example.prueba_kotin


import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.prueba_kotin.modelo.Artista
import com.example.prueba_kotin.modelo.Song

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(androidx.core.R.layout.notification_action)

        var artista:Artista=Artista("Juan Esteban Aristizábal Vásquez",
            "Juanes","09/08/1972")
        var cancion:Song=Song("La camisa negra",artista,2004,177000)

        println(artista)
        println("popularidad es : ${cancion.getPopular()} con ${cancion.getReproducciones()} reproduciones")
        println(cancion.descripcionCancion())

        
    }
    /*
    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!")
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Prueba_kotinTheme {
            Greeting("Android")
        }
    }*/
}
