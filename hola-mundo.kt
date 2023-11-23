   fun main(args: Array < String > ) {

       /* 
        In Kotlin, everything is an object in the sense 
        that we can call member functions and properties on 
        any variable
        
        Double 64 bits
        Float 32

        Long 64
        Int 32
        Short 16
        Byte 8

        example 1 Byte = 8 bits => 2^8 
        min value = -128 
        max value =  127

        Characters, Strings, Arrays, Booleans

        */

       // var, it's used with mutable variables
       var num1: Byte = 127
       var num2: Short = 32762
       var num3: Int = 10

       println("La suma de $num2 + $num1 es: " + (num2 + num1))
       println("La suma de $num2 + $num1 es: ${num2 + num1}")
       println("El modulo de $num2 % $num1 es: ${num2.toDouble() % num1.toDouble()}")

       // Unit operators, only when unit operator is prefix, it is used immediately
       println("para el numero: ${num3++}, incremento postfijo es: ${num3}")
       println("Incremento PreFijo de $num3 es: ${++num3}")

       // val, it's used with immutable variables or also called constants
       var age: Int = 24
       var my_char: Char = '5'
       var text: String = "age is: "
       val temperature: Float = 23.5F
       val PI: Double = 3.1415
       var logic: Boolean = true

       // include scape secuence and tabulator
       println("The " + text + "$age\nthe constant is $PI\ntext value has ${text.length} characters\nTemperature is $temperature\n$logic")

       // String without format
       var cadena: String = """
       Hola
       Carlos"""
       println(cadena)

       // casting
       var charToInt: Int = my_char.digitToInt()
       println(charToInt)

       // java method
       println(Character.getNumericValue(my_char)) // getNumericValue(number)
       println(text[0])

       // arrays
       var arregloInt: Array < Int > = arrayOf(1, 2, 3)
       var arregloString: Array < String > = arrayOf("carlos", "sole", "Dany")
       var arregloAny = arrayOf("carlos", 12, 56)
       println(args.size)
       println(arregloInt[0])
       println(arregloString[2])
       println(arregloAny[0])

   }