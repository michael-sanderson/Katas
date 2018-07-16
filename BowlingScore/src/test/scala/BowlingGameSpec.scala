/**
  * Created by ddcn32576 on 20/06/17.
  */

import org.scalatest.{Matchers, WordSpec}


class BowlingGameSpec extends WordSpec with Matchers {

  val standardFrame = Frame(5, Some(4))
  val spareFrame = Frame(5, Some(5))
  val strikeFrame = Frame(10)
  val bonusFrameSpare = Frame(9, Some(1), Some(9))
  val bonusFrameStrike = Frame(10, Some(9), Some(1))
  val bonusFrameStrikes = Frame(10, Some(10), Some(10))
  val standardGame = List(standardFrame,standardFrame,standardFrame,standardFrame,standardFrame,standardFrame,standardFrame,standardFrame,standardFrame,standardFrame)
  val spareGame = List(spareFrame,spareFrame,spareFrame,spareFrame,spareFrame,spareFrame,spareFrame,spareFrame,spareFrame,bonusFrameSpare)
  val perfectGame = List(strikeFrame,strikeFrame,strikeFrame,strikeFrame,strikeFrame,strikeFrame,strikeFrame,strikeFrame,strikeFrame,bonusFrameStrikes)
  val randomGame = List(strikeFrame, Frame(7, Some(2)), Frame(9, Some(1)), Frame(8, Some(2)), standardFrame, Frame(8, Some(2)), strikeFrame, strikeFrame, Frame(9, Some(1)), Frame(10, Some(10), Some(8)))

  "BowlingGame" should {

        "calculate a game of all standard scores with no strikes or spares" in {

          val game = new BowlingGame
          game.score(standardGame) shouldBe 90

        }

        "calculate a game entirely of spares plus 9 on last bonus roll" in {

          val game = new BowlingGame
          game.score(spareGame) shouldBe 158

        }

          "calculate a perfect game of all strikes" in {

          val game = new BowlingGame
          game.score(perfectGame) shouldBe 300

    }

        "calculate a game of some strikes, some spares and some standard scores" in {

        val game = new BowlingGame
        game.score(randomGame) shouldBe 187

    }

  }

}
