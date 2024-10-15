object Currying2 {
  def main(args: Array[String]): Unit = {

    def multiplicar_curry(a: Int)(b: Int)(c: Int): Int = {
      a * b * c
    }

    // Uso de la función curryada
    val resultado = multiplicar_curry(2)(3)(4) // Resultado será 24
    println(resultado) // Imprime: 24
  }

}
