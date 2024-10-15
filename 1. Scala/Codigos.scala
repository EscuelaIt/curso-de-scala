object Codigos {
  def main(args: Array[String]): Unit = {
    val myFirstScalaVariable: Int = 5
    val bookTitle: String = "Lord of the Rings: The Fellowship of the Ring"
    val bookAuthor: String = "J. R. R. Tolkien"

    val bookNoOfPages: Int = 423
    val message: String = "Hello World"
    println(message)

    val myDoubleVariable: Double = 2.75
    val myFloatVariable: Float = 2.75f
    val myLongVariable: Long = 275000000000L
    val myIntVariable: Int = 275
    val myShortVariable: Short = 1
    val myByteVariable: Byte = 0xa
    val myCharVariable: Char = ' '
    val myUnitVariable: Unit = ()
    val myBooleanVariable: Boolean = true

    val name = "Ben"
    val age = 18
    print(s"$name is $age years old.")

    val A = true
    val B = false
    val exp = A && B //false
    println(!A)
    println(!B)
    println(true && exp)
    println(false && exp)
    println(true || exp)
    println(false || exp)

    val operand1 = 10
    val operand2 = 7
    println(operand1 + operand2)
    println(operand1 - operand2)
    println(operand1 * operand2)
    println(operand1 / operand2)
    println(operand1 % operand2)
    println(operand1 > operand2)
    println(operand1 < operand2)
    println(operand1 >= operand2)
    println(operand1 <= operand2)
    println(operand1 != operand2)

  }
}
