package com.example.prueba_kotin
import com.example.prueba_kotin.modelo.Artista

class Song {
    /*
    * Propiedades para el título, el artista, el año de publicación y
    * el recuento de reproducciones
    * */

    private var titulo: String
    private var artista: Artista
    private var añoPublicacion:Int=1860
    private var reproducciones:Int


    constructor(titulo: String, artista: Artista, añoPublicada: Int, reproducciones: Int) {
        this.titulo = titulo
        this.artista = artista
        this.añoPublicacion = añoPublicada
        this.reproducciones = reproducciones
    }

    //Getters and Setters
    fun getTitulo(): String {return this.titulo}
    fun getArtista(): Artista {return this.artista}
    fun getAñoPublicacion(): Int {return this.añoPublicacion}
    fun getReproducciones(): Int {return this.reproducciones}

    fun setTitulo(new:String) { this.titulo= new}
    fun setArtista(new:Artista) { this.artista= new}
    fun setAñoPublicacion(new:Int) { this.añoPublicacion= new}
    fun setReproducciones(new:Int) { this.reproducciones= new}
    //end Getters and setters

    fun getPopular():Boolean{return getAñoPublicacion()>1000}
    fun descripcionCancion():String {
        return "${getTitulo()}, interpretada por ${getArtista().getNombreArtistico()}, se lanzó en ${getAñoPublicacion()}."
    }


}