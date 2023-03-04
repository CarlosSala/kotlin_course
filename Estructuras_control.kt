fun main(args: Array<String>) {

     /*
    operadores aritmeticos  + - * /
    operadores logicos      && || !
    operadores relacionales < > == <= >= !=
    */
    
    // estructuras de control

    var num1 = 7.0
    var num2 = 3.0
    var num3 = 1.0

    var numMayor = if (num1 > num2 && num1 > num3) num1 else if (num2 > num1 && num2 > num3) num2 else num3
    println("El numero mayor es: $numMayor")

    var prom = (num1 + num2 + num3)/3
    println("El promedio es $prom")

    if (prom >= 4) {
        println("Aprueba")
    } else if (prom in 3.0..3.9) {
        println("Debe recuperar")
    } else {
        println("Reprueba")
    }

    //  if (num2 > num1) println("num2 mayor que num1")
    //     println("num1 mayor que num2")

    // decimales
    var d: Float = 4.2222223434F
    println("El numero $d con 4 decimales es: " + "%.4f".format(d))

    // when similar a switch en otros lenguajes
    val calificacion: Int = 3
    var resena =  when (calificacion) {

        1 -> "pesimo servicio"

        2 -> "muy malo"

        3 ->
        {
            "malo"
           // println("El cliente dijo que era malo en servicio")
         
        }

        4 -> "regular"

        in 5..10 -> "bueno"

        11 -> "excelente"

        else -> "no valida"
    }

    print("La resena es : $resena\n")

    // Range
    // a..b       define un intervalo entre los valores a y b
    // x in a..b  valida si x se encuentra dentro del intervalo
    // x !in a..b valida si x No se encuentra delntro del intervalo

    var result: Boolean = 5 in 1..10
    println("El 5 esta dentro del intervalo 1..10 ? : $result")
    var chain: Boolean = 'e' in 'a'..'c'
    println("La letra e esta dentro del intervalo a..c : $chain")

    // el Ciclo for

    for(i in 1..10) println(i)

    // other example cicle for

    var ArregloNumbers = intArrayOf(12, 22, 32, 42, 52, 62, 72, 82, 92, 102)

    for ((indice, value) in (1..10).withIndex()) {

        println("El indice del rango es $indice, el valor es $value")
        println("El valor en el array es: ${ArregloNumbers[indice]}")
    }

    // cicls while y do while
    var x = 0

    // while(x<=10){

    //     print("$x\n")

    //     x++
    // }

    do {
        println("Dentro del do while")
    } while (x != 0)
}