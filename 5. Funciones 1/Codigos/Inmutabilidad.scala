object Inmutabilidad {
  def main(args: Array[String]): Unit = {
    // Usando una lista inmutable
    val numeros = List(1, 2, 3, 4)

    // Intentando modificar la lista no es posible, pero puedes crear una nueva
    val nuevosNumeros = numeros :+ 5
    println(numeros) // Imprime List(1, 2, 3, 4)
    println(nuevosNumeros) // Imprime List(1, 2, 3, 4, 5)
  }

}
