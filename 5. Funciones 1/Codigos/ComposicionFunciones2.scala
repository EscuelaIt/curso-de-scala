object ComposicionFunciones2 {
  def main(args: Array[String]): Unit = {
    val dividirPor2 = (x: Int) => x / 2
    val restar1 = (x: Int) => x - 1

    val funcionCompuesta = dividirPor2.andThen(restar1)

    println(funcionCompuesta(10)) // Salida: 4 (10 / 2 - 1)
  }

}
