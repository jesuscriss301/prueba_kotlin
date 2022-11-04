package com.example.prueba_kotin


import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(androidx.core.R.layout.notification_action)
        var juan: Deportista = Deportista("juan",1.8f,94.6f,22)
        println(juan.descansar())
        var luisa: Ciclista = Ciclista("juan",1.7f,8.6f,27,2,50f)
        println(luisa.descansar())
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
