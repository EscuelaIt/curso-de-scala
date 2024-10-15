class Rectangulo(val ancho: Double, val alto: Double) {
  def area(): Double = ancho * alto
}

// Para probar la clase, puedes agregar el siguiente código en el mismo archivo
object Main6 {
  def main(args: Array[String]): Unit = {
    val rectangulo = new Rectangulo(5.0, 10.0)
    println(s"El área del rectángulo es: ${rectangulo.area()}")
  }
}
