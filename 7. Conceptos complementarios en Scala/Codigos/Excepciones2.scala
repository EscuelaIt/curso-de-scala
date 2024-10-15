object Excepciones2  {
  def dividir (n1:Int,n2:Int):Float= {
    n1/n2
  }

  def main(args: Array[String]): Unit = {
    try {
      //println(dividir(10, 0))
      println(dividir(10, 5))
    }catch {
      case ex: ArithmeticException => println("Se ha producido la excecpion:"+ex)
    }
  }
}
