object FuncionesOrdenSuperior {
  def main(args: Array[String]): Unit = {
    def aplicarFuncion(f: Int => Int, x: Int): Int = f(x)

    val doble = (x: Int) => x * 2
    println(aplicarFuncion(doble, 10)) // Salida: 20

    def sumar(n: Int): Int => Int = {
      (x: Int) => x + n
    }

    val sumar5 = sumar(5)
    println(sumar5(10)) // Salida: 15

  }
}
