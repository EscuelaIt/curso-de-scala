object PatternMatching3 {
  def main(args: Array[String]): Unit = {
    def describeTupla(tupla: (Int, String)): String = {
      tupla match {
        case (n, s) if n > 0 => s"El número $n es positivo y su texto es '$s'"
        case (n, s) => s"El número $n es no positivo y su texto es '$s'"
      }
    }

    println(describeTupla((5, "Scala")))
    println(describeTupla((-10, "Scala")))
  }

}
