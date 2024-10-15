class Animal {
  def hacerSonido(): String = "Algun sonido"
}

class Perro extends Animal {
  override def hacerSonido(): String = "Guau"
}

class Gato extends Animal {
  override def hacerSonido(): String = "Miau"
}

// Para probar la clase, puedes agregar el siguiente código en el mismo archivo
object Main1 {
  def main(args: Array[String]): Unit = {
    def emitirSonido(animal: Animal): Unit = {
      println(animal.hacerSonido())
    }

    val miPerro = new Perro()
    val miGato = new Gato()

    emitirSonido(miPerro)  // Guau
    emitirSonido(miGato)   // Miau
  }
}



