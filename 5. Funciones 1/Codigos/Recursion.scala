object Recursion {
  def main(args: Array[String]): Unit = {
    // Función recursiva para calcular el factorial
    def factorial(n: Int): Int = {
      if (n <= 1) 1
      else n * factorial(n - 1)
    }

    println(factorial(5)) // Imprime 120
  }
}
