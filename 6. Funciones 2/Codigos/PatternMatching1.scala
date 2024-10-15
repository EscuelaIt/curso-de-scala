object PatternMatching1 {
  def main(args: Array[String]): Unit = {
    val x: Any = "Hola"

    x match {
      case 5 => println("Es cinco")
      case x: String => println(s"Es un string: $x")
      case _ => println("No es ni cinco ni un string")
    }
  }

}
