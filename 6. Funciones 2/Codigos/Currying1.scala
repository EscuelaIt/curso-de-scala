object Currying1 {
  def main(args: Array[String]): Unit = {

    def sumar_curry(a: Int)(b: Int)(c: Int): Int = {
      a + b + c
    }

    // Uso de la función curryada
    val resultado = sumar_curry(2)(3)(4) // Resultado será 9
    println(resultado) // Imprime: 9
  }

}
