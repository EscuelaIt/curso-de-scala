object FuncionesParciales2 {
  def main(args: Array[String]): Unit = {
    // Definición de la función curried directamente para multiplicación
    def multiplicarCurried(a: Int)(b: Int): Int = a * b

    // Fijar el primer argumento a 3 usando el operador de subrayado
    val multiplicarPor3 = multiplicarCurried(3)(_)

    // Usar la nueva función
    println(multiplicarPor3(4)) // Salida: 12
    println(multiplicarPor3(10)) // Salida: 30
  }
}
