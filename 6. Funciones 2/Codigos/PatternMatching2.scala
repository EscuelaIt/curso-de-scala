object PatternMatching2 {
  def main(args: Array[String]): Unit = {
    def describeLista(lista: List[Int]): String = {
      lista match {
        case Nil => "Lista vacía"
        case head :: Nil => s"Lista con un elemento: $head"
        case head :: tail => s"Lista con varios elementos, primer elemento: $head"
      }
    }
    println(describeLista(List(1, 2, 3))) // Salida: Lista con varios elementos, primer elemento: 1
  }
}
