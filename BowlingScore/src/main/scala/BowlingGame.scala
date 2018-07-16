/**
  * Created by ddcn32576 on 20/06/17.
  */

case class Frame (roll1: Int, roll2: Option[Int] = None, bonusRoll: Option[Int] = None)

class BowlingGame {

  def score(bowlingScore: List[Frame]): Int = {

    val finalFrame = bowlingScore.last

    val adjustedScores = scoreSeparator(bowlingScore).map(bonus => addBonusScores(bonus)) :+ finalFrame

      adjustedScores.map(frame => frame.roll1 + frame.roll2.getOrElse(0) + frame.bonusRoll.getOrElse(0)).sum
  }

  private def addBonusScores(frames: (Frame, Frame, Frame)): Frame = {

    val frame1 = frames._1
    val frame2 = frames._2
    val frame3 = frames._3

    if (isSpareFrame(frame1)) {

    val adjustedSpareScore = frame1.copy(roll1 = frame1.roll1 + frame2.roll1)

    adjustedSpareScore

    }

    else if (isStrikeFrame(frame1)) {

      val adjustedStrikeScore = frame1.copy(roll1 = frame1.roll1 + frame2.roll1 + frame2.roll2.getOrElse(frame3.roll1))

      adjustedStrikeScore
    }
    else

      frame1
  }

  private def scoreSeparator(scores: List[Frame]): List[(Frame, Frame, Frame)] = {

    val frame1 = scores(0)
    val frame2 = scores(1)
    val frame3 = scores(2)
    val frame4 = scores(3)
    val frame5 = scores(4)
    val frame6 = scores(5)
    val frame7 = scores(6)
    val frame8 = scores(7)
    val frame9 = scores(8)
    val frame10 = scores(9)
    val placeHolderFrame = Frame(0)

    List((frame1, frame2, frame3),
        (frame2, frame3, frame4),
        (frame3, frame4, frame5),
        (frame4, frame5, frame6),
        (frame5, frame6, frame7),
        (frame6, frame7, frame8),
        (frame7, frame8, frame9),
        (frame8, frame9, frame10),
        (frame9, frame10, placeHolderFrame))
  }

  private def isSpareFrame(frame: Frame): Boolean = {
    frame match {
      case Frame(x, Some(y), None) if x + y == 10 => true
      case _ => false
    }
  }

  private def isStrikeFrame(frame: Frame): Boolean = {
    frame.roll1 match {
      case 10 => true
      case _ => false
    }

  }

}
