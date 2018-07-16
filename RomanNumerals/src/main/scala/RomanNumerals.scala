import scala.collection.immutable

/**
  * Created by ddcn32576 on 13/06/17.
  */
object RomanNumerals {

  val numberOne = "I"
  val numberFive = "V"
  val numberTen = "X"
  val numberFifty = "L"
  val numberHundred = "C"
  val numberFiveHundred = "D"
  val numberThousand = "M"

    def outputNumeral(inputNumber: Int): String = {

    val separatedNumber = splitNumber(numberToSplit = inputNumber)

    separatedNumber.size match {

      case 1 => convertUnits(separatedNumber(0))
      case 2 => convertTens(separatedNumber(0)) + convertUnits(separatedNumber(1))
      case 3 => convertHundreds(separatedNumber(0)) + convertTens(separatedNumber(1)) + convertUnits(separatedNumber(2))
      case 4 => convertThousands(separatedNumber(0)) + convertHundreds(separatedNumber(1)) + convertTens(separatedNumber(2)) + convertUnits(separatedNumber(3))
      case _ => "MMMM"
    }

  }

  private def convertUnits(units: Int): String = {

    units match {

      case number if number < 4 => numberOne * number
      case number if number == 4 => numberOne + numberFive
      case number if number == 5 => numberFive
      case number if number == 9 => numberOne + numberTen
      case number if number > 5 => numberFive + (numberOne * (number - 5))

    }

  }

  private def convertTens(tens: Int): String = {

    tens match {

      case number if number <4 => numberTen * number
      case number if number == 4 => numberTen + numberFifty
      case number if number == 5 => numberFifty
      case number if number == 9 => numberTen + numberHundred
      case number if number > 5 => numberFifty + (numberTen * (number - 5))

    }

    }
 private def convertHundreds(hundreds: Int): String = {

   hundreds match {

     case number if number <4 => numberHundred * number
     case number if number == 4 => numberHundred + numberFiveHundred
     case number if number == 5 => numberFiveHundred
     case number if number == 9 => numberHundred + numberThousand
     case number if number > 5 => numberFiveHundred + (numberHundred * (number - 5))

   }

  }

  private def convertThousands(thousands: Int): String =

    thousands match {

    case number if number <5 => numberThousand * number
    case number if number > 4 => numberThousand * 4

  }

 private def splitNumber(numberToSplit: Int): IndexedSeq[Int] = {

   numberToSplit.toString.map(_.asDigit)


  }
}