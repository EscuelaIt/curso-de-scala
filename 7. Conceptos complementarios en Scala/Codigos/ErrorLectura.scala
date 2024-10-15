object ErrorLectura {

  def main(args: Array[String]): Unit = {
    import scala.io.Source
    import java.io.FileNotFoundException

    val filename = "C:/Users/layla/Escritorio/TextoPruebaxxxx.txt"
    try {
      val source = Source.fromFile(filename)
      for (linea <- source.getLines()) {
        println(linea)
      }
      source.close()
    } catch {
      case e: FileNotFoundException =>
        println(s"No se encontró el archivo: $filename")
    }
  }
}
