case class Patient(age: Int, insured: Boolean) {

  val DiscountModifier: Double = age match {

    case x if x > 70 => 0.10
    case x if x > 64 => 0.40
    case x if x < 5 => 0.60
    case _ => 1.00

  }

}