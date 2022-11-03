package com.example.prueba_kotin
open class Deportista {

    private var nombre:String = ""
    private var estatura: Float = -1F
    private var peso: Float = -1F
    private var edad: Int = -1

    constructor(nombre:String, estatura:Float, peso:Float, edad: Int)  {
        this.nombre = nombre
        this.estatura = estatura
        this.peso = peso
        this.edad = edad
    }
    //GETTERS AND SETTERS
    fun getnombre():String{return this.nombre }
    fun getestatura():Float{return this.estatura}
    fun getpeso():Float{return this.peso}
    fun getedad():Int{return this.edad}
    fun setnombre(nombre_n:String){ this.nombre=nombre_n }
    fun setestatura(estatura_n : Float){ this.estatura= estatura_n}
    fun setpeso(peso_n: Float){this.peso=peso_n}
    fun setedad(edad_n : Int){this.edad=edad_n}

    //END GETTERS AND SETTERS

    open fun descansar() {

        print("Este deportista esta mimido")
    }

}
class Ciclista: Deportista {
    var tipo_bici:Array<String> = arrayOf("montaña", "pista", "bmx","maraton")
    private var bicicleta: Int=-1
    private var velocidad:Float=0f

    constructor(nombre: String,estatura: Float,peso: Float,edad: Int, bicicleta:Int,velocidad: Float) :
            super(nombre,estatura, peso, edad) {
        this.bicicleta=bicicleta
        this.velocidad=velocidad
    }
    override fun descansar(){
        super.descansar()
        print("pero este ciclista volvera por más")
    }

    /**
     * Ciclista: pedalear (el mensaje debe indicar el tipo de bici y con qué velocidad lo está haciendo)
     */
    fun pedalear(): String {

        return "tipo de bicicleta:${this.tipo_bici[this.bicicleta]}, velocidad ${this.velocidad}km/h"
    }

}
class Runnner: Deportista {
    var estilos: Array<String> = arrayOf("100m lisos", "400m con obstaculos","maratón")
    var estilo:Int= -1
    var velocidad:Float=0f
    constructor(nombre: String,estatura: Float,peso: Float,edad: Int, estilo:Int,velocidad: Float) :
            super(nombre,estatura, peso, edad){
        this.estilo=estilo
        this.velocidad=velocidad
    }

    override fun descansar(){
        super.descansar()
        print("pero este corredor no se rinde!")
    }

    /**
     * Runner: correr (el mensaje debe indicar su estilo y con qué velocidad lo está haciendo)
     */
    fun correr(): String {

        return "tipo de bicicleta:${this.estilos[this.estilo]}, velocidad ${this.velocidad}km/h"
    }

}
class Nadador: Deportista {
    var velocidad:Float=0f
    var estilos: Array<String> = arrayOf("mariposa", "brazada", "buceo" )
    var estilo: Int=-1

    constructor(nombre: String,estatura: Float,peso: Float,edad: Int, estilo:Int,velocidad: Float) :
            super(nombre,estatura, peso, edad){
        this.estilo= estilo
        this.velocidad=velocidad
    }
    override fun descansar(){
        super.descansar()
        print("pero este nadador nllegara al fondo de este torneo")
    }

    /**
     * Nadador: nadar (el mensaje debe indicar el estilo y con qué velocidad lo está haciendo)
     */
    fun nadar(): String {

        return "Natacion estilo: ${this.estilos[this.estilo]}, a la velocidad de ${this.velocidad}m/s"
    }

}