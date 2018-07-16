sealed trait Direction {
  val asString: String
  val asChar: Char
}

case object N extends Direction {
  val asString: String = "North"
  val asChar: Char = 'N'
}

case object S extends Direction {
  val asString: String = "South"
  val asChar: Char = 'S'
}

case object E extends Direction {
  val asString: String = "East"
  val asChar: Char = 'E'
}

case object W extends Direction {
  val asString: String = "West"
  val asChar: Char = 'W'
}
