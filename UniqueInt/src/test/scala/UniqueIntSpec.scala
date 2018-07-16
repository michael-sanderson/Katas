import org.scalatest.{WordSpec, Matchers}
import UniqueInt._

class UniqueIntSpec extends WordSpec with Matchers {

  "FindUniqueInt" should {

    "return int as unique int when given a list with a single positive int" in {

      FindUniqueInt(List(1)) shouldBe 1

    }

    "return int as unique int when given a list with a single negative int" in {

      FindUniqueInt(List(-1)) shouldBe -1

    }

    "return only unique int when given a list with a single unique positive int" in {

      FindUniqueInt(List(1, 2, -1)) shouldBe 2

    }

    "return only unique int when given a list with a single unique negative int" in {

      FindUniqueInt(List(1, -2, -1)) shouldBe -2

    }

    "return only unique int when given a large list with a single unique int" in {

      FindUniqueInt(List(1, -1, -2, -3, 3, 2, 4, 5, -5)) shouldBe 4

    }

  }

}
