class CuentaBancaria(private var saldo: Double) {
  def depositar(cantidad: Double): Unit = {
    saldo += cantidad
  }

  def obtenerSaldo(): Double = saldo
}

// Para probar la clase, puedes agregar el siguiente código en el mismo archivo
object Main3 {
  def main(args: Array[String]): Unit = {
    val cuenta = new CuentaBancaria(1000)
    cuenta.depositar(500)
    println(s"Saldo actual: ${cuenta.obtenerSaldo()}")
  }
}
