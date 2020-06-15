fun main(args: Array<String>){

    // comentarios en kotlin
    /*  comentarios multilinea
     en kotlin */

     /*
     
     Double 64 bits
     Float 32
     Long 64
     Int 32
     Short 16
     Byte 8

     Characters, Strings, Arrays, Booleans

     */

     var age: Int = 24
     var text: String = "edad es: "
     val PI: Double = 3.1415
     var char: Char = '5'

    println("La " + text + age + " y la constante es $PI y text tiene ${text.length} caracteres")

    // casting
    var charToInt: Int = char.toInt()
    println("$char")
    // se le resta 48 debido al desfase de conversion a decimal
    println(charToInt - 48)
    println(text[0])

    // string con secuencia de escape
    var cadena: String = "Pirmera linea con salto de linea\n\tSegunda linea con tabulador"
    println(cadena)

    // String puro
    var cadena1: String = """Hola 

    Carlos"""
    println(cadena1)

    // arrays
    var arregloInt: Array<Int> = arrayOf(1,2,3)
    var arregloString: Array<String> = arrayOf("carlos", "sole", "Dany")
    var arregloAny = arrayOf("carlos", 12, 56)
   
    println(args.size)
    println(arregloInt[0])
    println(arregloString[2])
    println(arregloAny[0])

}