object CurryingFP {
  def main(args: Array[String]): Unit = {
    // Definición de la función curried y parcial
    def dividirCurried(numerador: Int)(denominador: Int): Double = {
      if (denominador != 0) {
        numerador.toDouble / denominador
      } else {
        throw new ArithmeticException("No se puede dividir por cero")
      }
    }

    // Fijar el numerador a 10 usando el operador de subrayado
    val dividirPor10 = dividirCurried(10)(_)

    // Usar la nueva función
    println(dividirPor10(2))  // Salida: 5.0
    //println(dividirPor10(0)) // Esto lanzará una excepción
  }

}
