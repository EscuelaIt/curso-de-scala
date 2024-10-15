object FPCEjemplo1 {
  def main(args: Array[String]): Unit = {
    // Definición de una función
    def suma(a: Int, b: Int): Int = a + b

    // Pasar la función como argumento
    def operar(a: Int, b: Int, operacion: (Int, Int) => Int): Int = operacion(a, b)

    val resultado = operar(5, 10, suma)
    println(resultado) // Imprime 15
  }

}
