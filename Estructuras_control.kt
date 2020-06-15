fun main(args: Array<String>) {

     // operadores aritmeticos, logicos y de comparacion
    /*
    + - * /
    != && || 
    < > == <= >=
    */

    // estructuras de control

    var a: Int = 122
    var b: Int = 20
    var c: Int = 34
    var numMayor: Int = if (a> b && a> c) a else if (b> a && b> c) b else c

    println("El numero mayor es: $numMayor")

    if (a > b) {
        println("a mayor que b")
    } else {
        println("a menor que b")
    }

    // when similar a switch en otros lenguajes

    val calificacion: Int = 12
    var resena: String

    when (calificacion) {

        1 -> resena = "pesimo servicio"

        2 -> resena = "muy malo"

        3 ->
        {
            println("El cliente dijo que era malo en servicio")
            resena = "malo"
        }

        4 -> resena = "regular"

        in 5..10 -> resena = "bueno"

        11 -> resena = "excelente"

        else -> resena = "no valida\n"
    }

    print(resena)

    // el Ciclo for

    // for(i in 1..10 ) println(i)

    var ArregloNumbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for ((indice, value) in (1..10).withIndex()) {

        println("El indice del rango es $indice, el valor es $value")
        println("El valor guardado en el array es: ${ArregloNumbers[indice]}")
    }

    // cicls while y do while
    var x = 0

    // while(x<=10){

    //     print("$x\n")

    //     x++
    // }

    do {
        println("Dentro del while")
    } while (x != 0)
}
