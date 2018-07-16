object ConjecturePoint {

  def findLengthOfSequence(startingNumber: BigInt): BigInt = applyCalculations(startingNumber).length

  def applyCalculations(startingNumber: BigInt): Stream[BigInt] = {

    startingNumber match {

      case n if n == 1 => Stream(1)
      case n if isEven(n) => Stream.cons(n, applyCalculations(applyEvenCalculation(n)))
      case _ => Stream.cons(startingNumber, applyCalculations(applyOddCalculation(startingNumber)))


    }
  }

  def isEven(number: BigInt): Boolean = number % 2 == 0
  def applyEvenCalculation(numberToModify: BigInt): BigInt = numberToModify / 2
  def applyOddCalculation(numberToModify: BigInt): BigInt = (numberToModify * 3) + 1

}