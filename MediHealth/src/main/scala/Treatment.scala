sealed trait Treatment {
  val cost: Double
}

case object Diagnosis extends Treatment {
  val cost: Double = 60.00
}

case object XRay extends Treatment {
  val cost: Double = 150.00
}

case object BloodTest extends Treatment {
  val cost: Double = 78.0
  val insuredReduction: Double = 0.15
}

case object ECG extends Treatment {
  val cost: Double = 200.40
}

case object Vaccine extends Treatment {
  val cost: Double = 15.00
  val serviceCost: Double = 27.50
}