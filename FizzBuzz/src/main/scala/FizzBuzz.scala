/**
  * Created by michael on 26/05/17.
  */
object FizzBuzz extends FizzBuzz {

  override def weekendHelper = WeekendHelper

}

trait FizzBuzz {

  def weekendHelper: WeekendHelper

  def divisionCheck (number: Int): String = {

    if(weekendHelper.isWeekend) {

      "This service is unavailable on weekends." }

      else

    number match {

      case x if x % 15 == 0 => "FizzBuzz"
      case x if x % 5 == 0 => "Buzz"
      case x if x % 3 == 0 => "Fizz"
      case x if x < 0 => "Requires number 0 or higher."
      case _ => "Not divisible by 3 or 5."
    }


  }
}
