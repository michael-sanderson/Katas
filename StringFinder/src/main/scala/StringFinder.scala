/**
  * Created by michael on 16/05/17.
  */
object StringFinder {

  val wordList = List("Hello", "Goodbye", "Morning", "Afternoon")

  def stringSearch (greeting: List[String]):String = {
   greeting.count(wordList.contains) match {
     case numberFound if numberFound > 0 => "Chosen strings found" + "!" * numberFound
     case _ => "No strings found"
    }
  }
}
