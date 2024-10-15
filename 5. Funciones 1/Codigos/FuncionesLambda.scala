object FuncionesLambda {
  def main(args: Array[String]): Unit = {
    val suma = (x: Int, y: Int) => x + y
    println(suma(3, 5)) // Imprime 8

    //Transformar una Lista:
    val numeros = List(1, 2, 3, 4, 5)
    val cuadrados = numeros.map(n => n * n)
    println(cuadrados) // Imprime List(1, 4, 9, 16, 25)

    // Filtrar una Lista:
    val pares = numeros.filter(n => n % 2 == 0)
    println(pares) // Imprime List(2, 4)

    //Ejercicio: Crear una expresión lambda que tome una lista de cadenas y devuelva solo aquellas que tienen más de 3 caracteres.
    val listaCadenas = List("uno", "dos", "tres", "cuatro", "cinco")
    val filtradas = listaCadenas.filter(cadena => cadena.length > 3)
    println(filtradas) // Salida: List(cuatro, cinco)
  }
}
