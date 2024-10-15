object Codigos {
  def main(args: Array[String]): Unit = {
    // Lista de números enteros
    val numbers = List(1, 2, 3, 4, 5)
    println(numbers) // Output: List(1, 2, 3, 4, 5)

    // Lista de nombres
    val names = List("Alice", "Bob", "Charlie")
    println(names) // Output: List(Alice, Bob, Charlie)#Acceso a Elementos

    //rimer y Último elemento
    val numbers2 = List(10, 20, 30, 40, 50)
    println(numbers2.head) // Output: 10
    println(numbers2.last) // Output: 50

    //Tail(Resto de la Lista)
    println(numbers.tail) // Output: List(20, 30, 40, 50)

    //Agregar elementos a una lista
    val updatedNumbers = numbers :+ 60
    println(updatedNumbers) // Output: List(10, 20, 30, 40, 50, 60)

    // Quitar el primer elemento
    val withoutFirst = numbers.tail
    println(withoutFirst) // Output: List(20, 30, 40, 50)

    //Transformaciones con map
    val squares = numbers.map(n => n * n)
    println(squares) // Output: List(100, 400, 900, 1600, 2500)

    val stringNumbers = numbers.map(_.toString)
    println(stringNumbers) // Output: List("10", "20", "30", "40", "50")

    //Filtrado con filter
    val evenNumbers = numbers.filter(_ % 2 == 0)
    println(evenNumbers) // Output: List(10, 20, 30, 40, 50)

    val filteredNames = names.filter(_.startsWith("A"))
    println(filteredNames) // Output: List(Alice)

    //Conjuntos
    val numbers3 = Set(1, 2, 3, 4, 5)
    println(numbers) // Output: Set(1, 2, 3, 4, 5)

    //Anadimos elementos:
    val fruits = Set("manzana", "plátano", "naranja")

    // Añadir una nueva fruta (esto crea un nuevo conjunto)
    val updatedFruits = fruits + "kiwi"
    println(updatedFruits) // Output: Set(manzana, plátano, naranja, kiwi)

    // Eliminar elementos
    // Crear un conjunto de colores
    val colors = Set("rojo", "verde", "azul")

    // Eliminar un color
    val reducedColors = colors - "verde"
    println(reducedColors) // Output: Set(rojo, azul)

    // Operaciones sobre conjuntos
    val setA = Set(1, 2, 3)
    val setB = Set(3, 4, 5)

    // Unión
    val union = setA.union(setB)
    println(union) // Output: Set(1, 2, 3, 4, 5)

    // Intersección
    val intersection = setA.intersect(setB)
    println(intersection) // Output: Set(3)

    // Creacion de mapas en Scala
    val ages = Map("Alice" -> 25, "Bob" -> 30, "Charlie" -> 35)
    println(ages) // Output: Map(Alice -> 25, Bob -> 30, Charlie -> 35)

    // Acceso a los elementos
    val aliceAge = ages("Alice")
    println(s"Alice's age: $aliceAge") // Output: Alice's age: 25

    // Anadir elementos
    val updatedAges = ages + ("David" -> 40)
    println(updatedAges) // Output: Map(Alice -> 25, Bob -> 30, Charlie -> 35, David -> 40)

    // Filtrar elementos
    val filteredAges = ages.filter { case (name, age) => age > 30 }
    println(filteredAges) // Output: Map(Charlie -> 35, David -> 40)

    // Crear un nuevo mapa con las edades aumentadas en 1
    val incrementedAges = ages.map { case (name, age) => (name, age + 1) }
    println(incrementedAges) // Output: Map(Alice -> 26, Bob -> 31, Charlie -> 36)

    // Calcular la suma de todas las edades con reduce
    val totalAge = ages.values.reduce(_ + _)
    println(totalAge) // Output: 90

    //Tuplas
    val person = ("Alice", 25, true)
    println(person) // Output: (Alice,25,true)

  }
}