
import org.scalatest.{Matchers, WordSpec}
import org.mockito.Mockito._
import org.scalatest.mockito.MockitoSugar
import org.mockito.ArgumentMatchers.{eq => eqTo, _}



class FizzBuzzSpec2 extends WordSpec with Matchers with MockitoSugar {

  def FizzBuzzCreate(weekend: Boolean): FizzBuzz = {

  val mockWeekendHelper = mock[WeekendHelper]
  when(mockWeekendHelper.isWeekend).thenReturn(weekend)

    new FizzBuzz {

      override def weekendHelper: WeekendHelper = mockWeekendHelper

    }

     }

     "FizzBuzz" should {

      "return 'not work weekends message' when today is a weekend" in {

        val result = FizzBuzzCreate(weekend = true).divisionCheck(9)

        result shouldBe "This service is unavailable on weekends."
      }


       "return 'Fizz' when number divisible by 3 and not a weekend" in {

         val result = FizzBuzzCreate(weekend = false).divisionCheck(9)

         result shouldBe "Fizz"
       }

         "return Buzz when number is divisible by 5 and not a weekend" in {

           val result = FizzBuzzCreate(weekend = false).divisionCheck(10)

           result shouldBe "Buzz"
      }

      "return FizzBuzz when number is divisible by 3 and 5 and not a weekend" in {

        val result = FizzBuzzCreate(weekend = false).divisionCheck(15)

        result shouldBe "FizzBuzz"
      }

      "return message asking for number of 0 or more when number is less than 0 and not a weekend" in {

        val result = FizzBuzzCreate(weekend = false).divisionCheck(-1)

        result shouldBe "Requires number 0 or higher."
      }

      "return message saying not divisible by 3 or 5 when number not divisible by 3 or 5 and not a weekend" in {

        val result = FizzBuzzCreate(weekend = false).divisionCheck(14)

        result shouldBe "Not divisible by 3 or 5."
      }
    }

  }
