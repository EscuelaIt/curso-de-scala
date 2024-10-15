object Codigos {
  def main(args: Array[String]): Unit = {

    var x = 5
    if (x > 10) print("Es mayor") else print("es menor")

    val edad = 25
    //val edad: Int = 25

    var resultado = if (edad > 30) "eres mayor" else "eres menor"
    //var resultado: String = eres menor

    //var x = 0
    //var x: Int = 0

    while (x < 10) {
      println (x)
      x = x + 1
    }

    for (i <- 1 until 10) {
      println (i)
    }

    val lista1 = List("alberto", "rosa", "pedro")
    print(lista1)
    print(lista1(0))

    for (i <- lista1) {
      println (i)
    }

    def f1(): String = {
      "hola"
    }

    f1()

    def f2(): Unit = {
      println ("esto es una prueba")
    }

    f2()

    def sumar(nro1: Int, nro2: Int): Int = {
      nro1 +nro2
    }
    print(sumar(10, 10))

  }
}
