import org.scalatest.{WordSpec, Matchers}
import PizzaOrder.orderPizza

class PizzaOrderSpec extends WordSpec with Matchers {

  "PizzaOrder" should {

    "return 'Number of apprentices does not match number of requests' when given mismatching order" in {

      orderPizza(Order(3, List(Quarter, Half, Eighth, Half))) shouldBe "Number of apprentices does not match number of requests"

    }

    "return correct message when given valid order" in {

      orderPizza(Order(3, List(Quarter, Half, Eighth))) shouldBe "To feed 3 hungry apprentices, I need 1 pizza. There will be 1 slice remaining."

    }
  }
}
