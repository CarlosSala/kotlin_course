// a lambda es una funcion no declarada, pasada como una expresion
// no esta ligada a aun identificador y se puede usar como valor
// las funciones se pueden almacenar en variables o estructuras de datos
// y pasarlas como parametros o devolverse de otras funciones
// el cuerpo va despues del simbolo ->
// sino retorna unit (void) retorna el ultimo valor 
// si el ultimo parametro de una funcion es otra funcion, esta funcion recibida como
// parametro se colocara como una expresion lamdba fuera de los parentesis trailing lambda
// si no se usa un parametro de la lambda, se puede usar un _ en lugar del nombre
// si solo hay un parametro declarado en la expresion lambda, podemos usar en el cuerpo de la 
// expresion la palabra it para referirnos a el
// la funciones lambdas son mas sencillas de definir


fun main(args: Array<String>) {


  val cosenoUno = Math.cos(90.0)
  println("El coseno de 90 es: " + cosenoUno)

  println("Size args: ${args.size}")

  println("Multiplication result: " + MyOperations(8, 4, ::sum))
  println("Multiplication result: " + MyOperations(8, 4, multi))
  println("Lambda function result: " + MyOperations(8, 4, sumLambda))

}

  fun sum(x: Int, y: Int): Int{

    return x + y
  }

  // anonymous function
  val multi = fun (num1: Int, num2: Int): Int {

    // println(num1 + num2)
    return num1 * num2
}

  // lambda
  val sumLambda = {x:Int, y:Int -> x + y}

  // lambda
  private fun MyOperations(x: Int, y: Int, myFun: (Int, Int) -> Int): Int{

    println("Values introduced are: $x and $y")

    return myFun(x, y)
  }
  