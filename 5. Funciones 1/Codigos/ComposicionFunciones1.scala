object ComposicionFunciones1 {
  def main(args: Array[String]): Unit = {
    // Funciones simples
    def multiplicarPor2(x: Int): Int = x * 2

    def sumar3(x: Int): Int = x + 3

    // Composición de funciones
    val funcionCompuesta = (x: Int) => sumar3(multiplicarPor2(x))
    println(funcionCompuesta(5)) // Imprime 13
  }
}
