object MediHealth {

  def produceMedicalBill(treatments: List[Treatment], patient: Patient): Double = {

    val reduction = if (patient.insured) calculateInsuredReductions(treatments) else 0

    calculateTreatmentCharges(treatments, patient.DiscountModifier) - reduction

  }

  def calculateTreatmentCharges(treatments: List[Treatment], chargeModifier: Double): Double = {

    val totalTreatmentCharge = treatments.map(_.cost).sum

    val totalCost = if (treatments.contains(Vaccine)) {

      totalTreatmentCharge + Vaccine.serviceCost

    } else {

      totalTreatmentCharge

    }

    totalCost * chargeModifier

  }

  def calculateInsuredReductions(treatments: List[Treatment]): Double = {

    val bloodTests: Int = treatments.count(_ == BloodTest)

    if (treatments.contains(Diagnosis)) {

      bloodTests * (BloodTest.cost * BloodTest.insuredReduction)

    } else {

      0
    }

  }

}
