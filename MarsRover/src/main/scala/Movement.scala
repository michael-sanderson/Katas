sealed trait Movement {
  val action: String
  val asString: String
  val asChar: Char
}

case object F extends Movement {
  val action: String = "Moving"
  val asString: String = "forward"
  val asChar: Char = 'F'
}

case object B extends Movement {
  val action: String = "Moving"
  val asString: String = "backward"
  val asChar: Char = 'B'
}

case object L extends Movement {
  val action: String = "Turning"
  val asString: String = "left"
  val asChar: Char = 'L'
}

case object R extends Movement {
  val action: String = "Turning"
  val asString: String = "right"
  val asChar: Char = 'R'
}
