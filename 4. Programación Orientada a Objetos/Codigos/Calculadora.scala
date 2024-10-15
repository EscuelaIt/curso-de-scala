class Calculadora {
  def sumar(a: Int, b: Int): Int = a + b
  def sumar(a: Double, b: Double): Double = a + b
}

// Para probar la clase, puedes agregar el siguiente código en el mismo archivo
object Main2 {
  def main(args: Array[String]): Unit = {
    val calculadora = new Calculadora()
    println(calculadora.sumar(5, 10))          // Int
    println(calculadora.sumar(5.5, 10.5))      // Double
  }
}

