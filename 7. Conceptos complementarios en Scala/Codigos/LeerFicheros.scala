object LeerFicheros {

  def main(args: Array[String]): Unit = {

    //lectura de Fichero
    import scala.io.Source

    /*
    //opcion1
    val fichero="C:/Users/layla/Escritorio/TextoPrueba.txt"
    for (linea<- Source.fromFile(fichero).getLines()){
      println(linea)
    }
    */

    /*
    //opcion2
    val lineas=Source.fromFile("C:/Users/layla/Escritorio/TextoPrueba.txt").getLines().toList
    lineas.foreach(x=>println(x))
    */

    /*
    //opcion3
    val fichero1 = Source.fromFile("C:/Users/layla/Escritorio/TextoPrueba.txt")
    for (linea <- fichero1.getLines()) {
      println(linea)
    }
    fichero1.close()

    */

  }
}
