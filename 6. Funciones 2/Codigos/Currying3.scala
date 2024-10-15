object Currying3 {
  def main(args: Array[String]): Unit = {
    def concatenar_curry(a: String)(b: String)(c: String): String = {
      a + b + c
    }

    // Uso de la función curryada
    val resultado = concatenar_curry("Hola, ")("mundo")("!") // Resultado será "Hola, mundo!"
    println(resultado) // Imprime: Hola, mundo!
  }
}
