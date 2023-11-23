fun main(args: Array<String>) {

  var resultado = suma(2, 3)
  println(resultado)

  val cosenoUno = Math.cos(90.0)
  println("El coseno de 90 es: " + cosenoUno)

  println(args.size)
}

  fun suma(num1: Int, num2: Int): Int {

      // println(num1 + num2)
      return num1 + num2
  }