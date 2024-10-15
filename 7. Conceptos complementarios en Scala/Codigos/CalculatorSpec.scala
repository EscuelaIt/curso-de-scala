// CalculatorSpec.scala
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CalculatorSpec extends AnyFlatSpec with Matchers {
  "A Calculator" should "correctly add two numbers" in {
    val calculator = new Calculator
    val result = calculator.add(3, 5)
    result shouldEqual 8
  }
}
