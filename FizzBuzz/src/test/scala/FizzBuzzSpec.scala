import org.scalatest.{Matchers, WordSpec}

/**
  * Created by michael on 26/05/17.
  */
class FizzBuzzSpec extends WordSpec with Matchers{

  "FizzBuzz" should {

    "return Fizz when number is divisible by 3" in {

      FizzBuzz.divisionCheck(9) shouldBe "Fizz"
    }

    "return Buzz when number is divisible by 5" in {

      FizzBuzz.divisionCheck(20) shouldBe "Buzz"
    }

    "return FizzBuzz when number is divisible by 3 and 5" in {

      FizzBuzz.divisionCheck(15) shouldBe "FizzBuzz"
    }

    "return message asking for number of 0 or more when number is less than 0" in {

      FizzBuzz.divisionCheck(-1) shouldBe "Requires number 0 or higher."
    }

    "return message saying not divisible by 3 or 5 when number not divisible by 3 or 5" in {

      FizzBuzz.divisionCheck(14) shouldBe "Not divisible by 3 or 5."
    }
  }

}
