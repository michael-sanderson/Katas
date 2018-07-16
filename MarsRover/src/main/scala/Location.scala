case class Location (coordinates: Coordinates, var directionFacing: Direction) {
  val outputLocation: String = s"X: ${coordinates.x}, Y: ${coordinates.y}, facing: ${directionFacing.asString}"
}
