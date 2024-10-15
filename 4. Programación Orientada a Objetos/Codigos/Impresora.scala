class Impresora {
  def imprimir(texto: String): Unit = println(texto)
  def imprimir(numero: Int): Unit = println(s"Número: $numero")
}

// Para probar la clase, puedes agregar el siguiente código en el mismo archivo
object Main4 {
  def main(args: Array[String]): Unit = {
    val impresora = new Impresora()
    impresora.imprimir("Hola")
    impresora.imprimir(42)
  }
}
