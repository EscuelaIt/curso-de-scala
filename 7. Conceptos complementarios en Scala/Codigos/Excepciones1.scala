object Excepciones1 {
  def main(args: Array[String]): Unit = {
    try {
      // Intentamos convertir una cadena a un número
      val number = 123.toInt
      println(s"Número convertido: $number")
    } catch {
      case e: NumberFormatException =>
        println("Error: La cadena no se puede convertir a un número.")
    }
  }
}
