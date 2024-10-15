abstract class Vehiculo {
  def velocidadMaxima(): Double
}

class Coche extends Vehiculo {
  def velocidadMaxima(): Double = 180.0
}

class Bicicleta extends Vehiculo {
  def velocidadMaxima(): Double = 25.0
}

// Para probar la clase, puedes agregar el siguiente código en el mismo archivo
object Main7 {
  def main(args: Array[String]): Unit = {
    val miCoche = new Coche()
    val miBicicleta = new Bicicleta()
    println(s"Velocidad máxima del coche: ${miCoche.velocidadMaxima()} km/h")
    println(s"Velocidad máxima de la bicicleta: ${miBicicleta.velocidadMaxima()} km/h")
  }
}

