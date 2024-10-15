object FuncionesParciales1 {
  def main(args: Array[String]): Unit = {
    // Definición de la función curried directamente
    def sumarCurried(a: Int)(b: Int): Int = a + b

    // Fijar el primer argumento a 5 usando el operador de subrayado
    val sumaCon5 = sumarCurried(5)(_)

    // Usar la nueva función
    println(sumaCon5(10)) // Salida: 15
    println(sumaCon5(20)) // Salida: 25
  }

}
