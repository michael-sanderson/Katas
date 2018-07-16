case class Order(numberOfApprentices: Int, quantitiesOrdered: List[Fraction])

sealed trait Fraction {
  val numberOfSlices: Int
}
case object Eighth extends Fraction {
  override val numberOfSlices: Int = 1
}
case object Quarter extends Fraction {
  override val numberOfSlices: Int = 2
}
case object Half extends Fraction {
  override val numberOfSlices: Int = 4
}
case object ThreeQuarter extends Fraction {
  override val numberOfSlices: Int = 6
}
case object Whole extends Fraction {
  override val numberOfSlices: Int = 8
}

object PizzaOrder {

  def orderPizza(order: Order): String = {

    val outputPrefix: String = s"To feed ${order.numberOfApprentices} hungry apprentices, I need"

    order.numberOfApprentices match {

      case x if x == order.quantitiesOrdered.length => {

        val slicesNeeded: Int = order.quantitiesOrdered.map(x => x.numberOfSlices).sum
        val pizzasRequired: Int = Whole.numberOfSlices / slicesNeeded
        val slicesLeft: Int = (pizzasRequired * Whole.numberOfSlices) - slicesNeeded
        val outputSuffix: String = if(pizzasRequired > 1) "pizzas." else "pizza."
        val leftMessage: String = if(slicesLeft != 1) s"There will be $slicesLeft slices remaining." else "There will be 1 slice remaining."

        s"$outputPrefix $pizzasRequired $outputSuffix $leftMessage"
      }

      case _ => "Number of apprentices does not match number of requests"
    }
  }
}


