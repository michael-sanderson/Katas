class Rover(location: Location) {

  private def x: Int = location.coordinates.x
  private def y: Int = location.coordinates.y
  private def direction: Direction = location.directionFacing

  def currentLocation: Location = Location(Coordinates(x, y), direction)
  def startingLocation: String = s"Starting location is: ${currentLocation.outputLocation}"

  def sendCommands(commands: List[Movement]): List[String] = {

    startingLocation :: commands.map {

      case F => move(F)
      case B => move(B)
      case L => turn(L)
      case R => turn(R)

    }
  }

  private def move(moveDirection: Movement): String = {

    (moveDirection, location.directionFacing) match {

      case (F, N) | (B, S) => location.coordinates.y += 1
      case (F, S) | (B, N) => location.coordinates.y -= 1
      case (F, E) | (B, W) => location.coordinates.x += 1
      case (F, W) | (B, E) => location.coordinates.x -= 1

    }

    createLogEntry(moveDirection)

  }

  private def turn(turnDirection: Movement): String = {

    val directions: List[Direction] = List(N, E, S, W)
    val index: Int = directions.indexWhere(d => d.equals(location.directionFacing))

    (turnDirection, index) match {

      case (L, 0) => location.directionFacing = directions(3)
      case (L, i) => location.directionFacing = directions(i - 1)
      case (R, 3) => location.directionFacing = directions(0)
      case (R, i) => location.directionFacing = directions(i + 1)

    }

    createLogEntry(turnDirection)

  }

  private def createLogEntry(movement: Movement): String = {
    s"${movement.action} ${movement.asString} and new location is: ${currentLocation.outputLocation}"
  }
}



