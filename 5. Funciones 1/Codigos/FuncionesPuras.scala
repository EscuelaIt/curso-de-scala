object FuncionesPuras {
  def main(args: Array[String]): Unit = {
    // Función pura
    def cuadrado(x: Int): Int = x * x

    println(cuadrado(4)) // Imprime 16
    println(cuadrado(4)) // Siempre devuelve 16
  }

}
