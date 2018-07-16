import org.scalatest.{WordSpec, Matchers}

class RoverSpec extends WordSpec with Matchers {

  "Rover" should {

    "accept starting coordinates and direction" in {
      val rover = new Rover(Location(Coordinates(5, 7), E))
      rover.startingLocation shouldBe "Starting location is: X: 5, Y: 7, facing: East"
      rover.currentLocation.outputLocation shouldBe "X: 5, Y: 7, facing: East"
    }

    "correctly compute a list of given commands and return log" in {
      val rover = new Rover(Location(Coordinates(11, 4), S))
      rover.startingLocation shouldBe "Starting location is: X: 11, Y: 4, facing: South"
      rover.sendCommands(List(F, L, F, F, R, R, B, B, L, F, R, B)) shouldBe List(
        "Starting location is: X: 11, Y: 4, facing: South",
        "Moving forward and new location is: X: 11, Y: 3, facing: South",
        "Turning left and new location is: X: 11, Y: 3, facing: East",
        "Moving forward and new location is: X: 12, Y: 3, facing: East",
        "Moving forward and new location is: X: 13, Y: 3, facing: East",
        "Turning right and new location is: X: 13, Y: 3, facing: South",
        "Turning right and new location is: X: 13, Y: 3, facing: West",
        "Moving backward and new location is: X: 14, Y: 3, facing: West",
        "Moving backward and new location is: X: 15, Y: 3, facing: West",
        "Turning left and new location is: X: 15, Y: 3, facing: South",
        "Moving forward and new location is: X: 15, Y: 2, facing: South",
        "Turning right and new location is: X: 15, Y: 2, facing: West",
        "Moving backward and new location is: X: 16, Y: 2, facing: West")
      rover.currentLocation.outputLocation shouldBe "X: 16, Y: 2, facing: West"
    }
  }
}
