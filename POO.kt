// la clase recibiendo parametros, esta forma es mas limitada que usar constructores
// class Frutas(color:String, sabor:String, precio:Int){
// la clase por defecto es de tipo final, osea no es heredable por otra clase
// o puede ser de tipo open

   open class Frutas() {

    var color: String = ""
    var sabor: String = ""
    var precio: Int = 0
    var numHojas: Int = 0

    // init{
    //     this.color = color
    //     this.sabor = sabor
    //     this.precio = precio
    // }

    // posee sobre carga de constructores

    constructor (color: String, sabor: String, precio: Int) : this() {

        this.color = color
        this.sabor = sabor
        this.precio = precio
    }

    constructor (color: String, sabor: String, precio: Int, numHojas: Int) : this() {

        this.color = color
        this.sabor = sabor
        this.precio = precio
        this.numHojas = numHojas
    }

    fun Pudrirse(nombre: String?) {

        if (!nombre.isNullOrEmpty()) {
            println("La $nombre se pudre")
        } else {
            println("La fruta se pudre")
        }
    }
}

class FrutaConGrasa() : Frutas() {

    var cantidadGrasa: Int = 0

    constructor(cantidadGrasa: Int) : this() {

        this.cantidadGrasa = cantidadGrasa
    }
}

// otra clase definida por la función main unica en cada clase

fun main(args: Array<String>) {

    var manzana = Frutas("verde", "amargo", 4)

    println("el color de la manzana es: " + manzana.color)
    manzana.Pudrirse(null)

    var paltaConGrasa = FrutaConGrasa(45)
    paltaConGrasa.color = "negra"
    println("el color de la palta es :" + paltaConGrasa.color)
    paltaConGrasa.Pudrirse("palta")    
}