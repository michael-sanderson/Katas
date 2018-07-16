/**
  * Created by ddcn32576 on 13/06/17.
  */
import org.scalatest.{Matchers, WordSpec}

class RomanNumeralsSpec extends WordSpec with Matchers{

  "Roman Numerals" should {

    "return 'I' when given '1'" in {

      RomanNumerals.outputNumeral(1) shouldBe "I"
    }

    "return 'V' when given '5'" in {

      RomanNumerals.outputNumeral(5) shouldBe "V"
    }

    "return 'IV' when given '4'" in {

      RomanNumerals.outputNumeral(4) shouldBe "IV"
    }

    "return 'VI' when given '6'" in {

      RomanNumerals.outputNumeral(6) shouldBe "VI"
    }

    "return 'IX' when given '9'" in {

      RomanNumerals.outputNumeral(9) shouldBe "IX"
    }

    "return 'X' when given '10'" in {

      RomanNumerals.outputNumeral(10) shouldBe "X"
    }

    "return 'XL' when given '40'" in {

      RomanNumerals.outputNumeral(40) shouldBe "XL"
    }

    "return 'L' when given '50'" in {

      RomanNumerals.outputNumeral(50) shouldBe "L"
    }

    "return 'XC' when given '90'" in {

      RomanNumerals.outputNumeral(90) shouldBe "XC"
    }

    "return 'LXX' when given '70'" in {

      RomanNumerals.outputNumeral(70) shouldBe "LXX"
    }

    "return 'XXX' when given '30'" in {

      RomanNumerals.outputNumeral(30) shouldBe "XXX"
    }

    "return 'C' when given '100'" in {

      RomanNumerals.outputNumeral(100) shouldBe "C"
    }

    "return 'CD' when given '400'" in {

      RomanNumerals.outputNumeral(400) shouldBe "CD"
    }

    "return 'D' when given '500'" in {

      RomanNumerals.outputNumeral(500) shouldBe "D"
    }

    "return 'CM' when given '900'" in {

      RomanNumerals.outputNumeral(900) shouldBe "CM"
    }

    "return 'DCC' when given '700'" in {

      RomanNumerals.outputNumeral(700) shouldBe "DCC"
    }

    "return 'CCC' when given '300'" in {

      RomanNumerals.outputNumeral(300) shouldBe "CCC"
    }

    "return 'M' when given '1000'" in {

      RomanNumerals.outputNumeral(1000) shouldBe "M"
    }

        "return 'MMMM' when given '5000'" in {

      RomanNumerals.outputNumeral(5000) shouldBe "MMMM"
    }

    "return 'MMMM' when given '4000'" in {

      RomanNumerals.outputNumeral(4000) shouldBe "MMMM"
    }

    "return 'MMMM' when given '7000'" in {

      RomanNumerals.outputNumeral(7000) shouldBe "MMMM"
    }

    "return 'XIV' when given '14'" in {

      RomanNumerals.outputNumeral(14) shouldBe "XIV"
    }

    "return 'XIX' when given '19'" in {

      RomanNumerals.outputNumeral(19) shouldBe "XIX"
    }

    "return 'LXXIV' when given '74'" in {

      RomanNumerals.outputNumeral(74) shouldBe "LXXIV"
    }

    "return 'DCCXCIV' when given '794'" in {

      RomanNumerals.outputNumeral(794) shouldBe "DCCXCIV"
    }

    "return 'MMMDCCXCIV' when given '3794'" in {

      RomanNumerals.outputNumeral(3794) shouldBe "MMMDCCXCIV"
    }

    "return 'MMDCXCVII' when given '2697'" in {

      RomanNumerals.outputNumeral(2697) shouldBe "MMDCXCVII"
    }

    "return 'MMMM' when given '22697'" in {

      RomanNumerals.outputNumeral(22697) shouldBe "MMMM"
    }

    "return 'MMMM' when given '8999'" in {

      RomanNumerals.outputNumeral(8999) shouldBe "MMMM"
    }

    }

}
