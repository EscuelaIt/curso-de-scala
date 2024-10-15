object EliminarArchivo{

  def main(args: Array[String]): Unit = {
    import java.io.File

    val filename = "C:/Users/layla/Escritorio/prueba.txt"
    val file = new File(filename)

    if (file.exists()) {
      file.delete()
      println(s"El archivo $filename ha sido eliminado exitosamente.")
    } else {
      println(s"El archivo $filename no existe.")
    }
  }
}
