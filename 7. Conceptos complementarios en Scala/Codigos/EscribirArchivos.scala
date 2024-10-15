object EscribirArchivos {

  def main(args: Array[String]): Unit = {
    import java.io._

    //Opcion1 PrintWriter
    val fichero =new PrintWriter((new File("C:/Users/layla/Escritorio/prueba.txt")))
    fichero.write("Esto es una prueba\n")
    fichero.close()
    /*
          //Opcion2 fileWriter
        val fichero1 =new File("C:/Users/layla/Escritorio/prueba2.txt")
        val bw=new BufferedWriter(new FileWriter(fichero1))
        bw.write("Esto es una prueba de FileWriter")
        bw.close()
        */
  }
}
