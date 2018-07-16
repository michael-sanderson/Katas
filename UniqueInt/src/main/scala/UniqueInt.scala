object UniqueInt {

  def FindUniqueInt(listOfInts: List[Int]): Int = {

    listOfInts.length match {

      case 1 => listOfInts.head
      case _ =>

        val absoluteInts: List[Int] = listOfInts.map(_.abs)
        val diff = absoluteInts.groupBy(X => X).filter(_._2.lengthCompare(1) == 0).keySet.head

        println(absoluteInts)
        println(diff)

        if(listOfInts.contains(diff)) {

          diff

        } else {

          0 - diff
        }

    }

  }

}



