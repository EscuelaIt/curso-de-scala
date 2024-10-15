object Excepciones3 {

  def pedirCarnetConducir(edad: Int) = {
    if (edad < 18) {
      throw new Exception("no tienes edad para pedir el carnet")
    }
    println("Carnet concedido")
  }

  def main(args: Array[String]): Unit = {
    try {
      println(pedirCarnetConducir(10))
    } catch {
      case ex: Throwable => println("Se ha producido la excepcion:" + ex)
    }
    finally {
      println("Este trozo de codigo siempre se ejecuta")
    }
  }
}
