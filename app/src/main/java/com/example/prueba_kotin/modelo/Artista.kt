package com.example.prueba_kotin.modelo

class Artista {

    private val nombreReal:String
    private var nombreArtistico:String=""
    private var fechaNacimiento: String=""
    private var grupoMusical:String="Solista"
    private var ocupacion:String=""

    constructor(
        nombreReal: String,
        nombreArtistico: String,
        fechaNacimiento: String,
        grupoMusical: String,
        ocupacion: String,
        ) {
        this.nombreReal=nombreReal
        this.nombreArtistico = nombreArtistico
        this.fechaNacimiento = fechaNacimiento
        this.grupoMusical = grupoMusical
        this.ocupacion = ocupacion
    }

    constructor(nombreReal: String,nombreArtistico: String, grupoMusical: String, ocupacion: String) {
        this.nombreArtistico = nombreArtistico
        this.grupoMusical = grupoMusical
        this.ocupacion = ocupacion
        this.nombreReal=nombreReal
    }


    override fun toString(): String {
        return "Artista(NombreReal='$nombreReal', nombreArtistico='$nombreArtistico', grupoMusical='$grupoMusical', ocupacion='$ocupacion')"
    }

    //Getter and Setter
    fun getNombreReal(): String {return this.nombreReal}
    fun getNombreArtistico(): String {return this.nombreArtistico}
    fun getFechaNacimiento(): String {return this.fechaNacimiento}
    fun getGrupoMusical(): String {return this.grupoMusical}
    fun getOcupacion(): String {return this.ocupacion}

    fun setNombreArtistico(new:String) { this.nombreArtistico= new}
    fun setFechaNacimiento(new: String) { this.ocupacion= new}
    fun setGrupoMusical(new: String) { this.ocupacion= new}
    fun setOcupacion(new: String) { this.ocupacion= new}
}