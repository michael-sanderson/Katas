import org.scalatest.{WordSpec, Matchers}
import ConjecturePoint._

class ConjecturePointSpec extends WordSpec with Matchers {

  "findLengthOfSequence" should {

    "return correct length of sequence when given an even starting number" in {

      findLengthOfSequence(20) shouldBe 8

    }

    "return correct length of sequence when given an odd starting number" in {

      findLengthOfSequence(50) shouldBe 25

    }

    "applyCalculations" should {

      "return a stream of BigInts" in {

        applyCalculations(20) shouldBe Stream(20, 10, 5, 16, 8, 4, 2, 1)

      }
    }

    "isEven" should {

      "return true when number is even" in {

        isEven(20) shouldBe true

      }

      "return false when number is odd" in {

        isEven(15) shouldBe false

      }
    }

    "applyEvenCalculation" should {

      "divide number by 2" in {

        applyEvenCalculation(100) shouldBe 50

      }
    }

    "applyOddCalculation" should {

      "multiply number by 3 and plus 1" in {

        applyOddCalculation(75) shouldBe 226

      }
    }
  }
}