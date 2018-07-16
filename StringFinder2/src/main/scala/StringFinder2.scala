
object StringFinder2 {

  def stringFind (salutations: List[String], merge: List[String] = List("")): String = {

    val declaredString = stringTransformation(general=salutations)
    val declaredString2 = stringTransformation(general=merge)
    val count1 = exclamationCounter(declaredString)
    val count2 = exclamationCounter(declaredString2)

    count2 match {
      case x if x.contains("Under 5") & count1.contains("Under 5") => count1 + " " + x
      case x if x.contains("Over 10") & count1.contains("Over 10") => count1 + " " + x
      case x if x.contains("Between 5-10") & count1.contains("Between 5-10") => count1 + " " + x
      case _ => "Not Working"
    }
  }

  def stringTransformation (general: List[String]): String = {

    general.sortWith(_<_).mkString(", ") + "!" * general.size

  }

  def exclamationCounter (input: String): String = {

    input.count(_ == '!') match {
      case x if x < 5 => input + " Under 5."
      case x if x >10 => input + " Over 10."
      case x if x >5 & x <11 => input + " Between 5-10."
    }
  }
}

