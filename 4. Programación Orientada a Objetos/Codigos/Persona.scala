class Persona(val nombre: String, val edad: Int) {
  def saludar(): String = s"Hola, mi nombre es $nombre y tengo $edad años."
}

object Main5 {
  def main(args: Array[String]): Unit = {
    val persona1 = new Persona("Juan", 30)
    println(persona1.saludar())

    val persona2 = new Persona("Maria", 25)
    println(persona2.saludar())
  }
}

