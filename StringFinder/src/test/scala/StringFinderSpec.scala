import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by michael on 16/05/17.
  */
class StringFinderSpec extends FlatSpec with Matchers {

  val found = "Chosen strings found"
  val notFound = "No strings found"

  "StringFinder" should "return Chosen strings found when Hello found" in {
    StringFinder.stringSearch(greeting = List("Hello")) shouldBe found + "!"
  }

  it should "return Chosen strings found when Goodbye found" in {
    StringFinder.stringSearch(greeting = List("Goodbye")) shouldBe found + "!"
  }

  it should "return chosen strings found plus exclamation mark for each string found" in {
    StringFinder.stringSearch(greeting = List("Goodbye", "Morning", "Misc")) shouldBe found + "!" * 2
  }

  it should "return Chosen strings found when a list of terms is found" in {
    StringFinder.stringSearch(greeting = List("Hello", "Goodbye", "Morning", "Afternoon")) shouldBe found + "!" * 4
  }

  it should "return no strings found when no strings found" in {
    StringFinder.stringSearch(List("misc")) shouldBe notFound
  }
}
