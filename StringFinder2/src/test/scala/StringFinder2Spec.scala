import org.scalatest.{Matchers, FlatSpec}

class StringFinder2Spec extends FlatSpec with Matchers{

"StringFinder2" should "return Hello when Hello is found" in {

  StringFinder2.stringFind(List ("Hello")) shouldBe "Hello! Under 5."
}

  it should "return Hello, Goodbye when Hello and Goodbye found" in {

    StringFinder2.stringFind(List ("Hello", "Goodbye")) shouldBe "Goodbye, Hello!! Under 5."
  }

  it should "return Hello, Goodbye, Morning in alphabetical order when Hello Goodbye and Morning found in any order" in {

    StringFinder2.stringFind(List ("Goodbye", "Morning", "Hello")) shouldBe "Goodbye, Hello, Morning!!! Under 5."

  }

  it should "add 2 exclamation marks to end of string based on number of words in list" in {

    StringFinder2.stringFind(List ("Hello", "Morning")) shouldBe "Hello, Morning!! Under 5."
  }

  it should "add Under 5 to end of string based on number of exclamation marks" in {

    StringFinder2.stringFind(List ("Hello")) shouldBe "Hello! Under 5."
  }

  it should "add Over 10 to end of string based on number of exclamation marks" in {

    StringFinder2.stringFind(List ("B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L")) shouldBe "B, C, D, E, F, G, H, I, J, K, L!!!!!!!!!!! Over 10."
  }

  it should "add Between 5-10 to end of string based on number of exclamation marks" in {

    StringFinder2.stringFind(List ("B", "C", "D", "E", "F", "G")) shouldBe "B, C, D, E, F, G!!!!!! Between 5-10."
  }

  it should "merge strings together when they share the under 5 exclamation marks grouping" in {
    StringFinder2.stringFind(List ("Hello"), List("Hello", "Goodbye")) shouldBe "Hello! Under 5. Goodbye, Hello!! Under 5."
  }

  it should "merge strings together when they share the over 10 exclamation marks grouping" in {
    StringFinder2.stringFind(List ("B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"), List("B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L")) shouldBe "B, C, D, E, F, G, H, I, J, K, L!!!!!!!!!!! Over 10. B, C, D, E, F, G, H, I, J, K, L!!!!!!!!!!! Over 10."
  }

  it should "merge strings together when they share the between 5-10 exclamation marks grouping" in {
    StringFinder2.stringFind(List ("B", "C", "D", "E", "F", "G"), List("B", "C", "D", "E", "F", "G")) shouldBe "B, C, D, E, F, G!!!!!! Between 5-10. B, C, D, E, F, G!!!!!! Between 5-10."
  }
}
