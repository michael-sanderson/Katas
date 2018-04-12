import org.scalatest.{WordSpec, Matchers}
import MediHealth._

class MediHealthSpec extends WordSpec with Matchers {

  val standardPatient = Patient(age = 25, insured = false)
  val seniorPatient = Patient(age = 65, insured = false)
  val seniorPatient70 = Patient(age = 71, insured = false)
  val childPatient = Patient(age = 4, insured = false)
  val insuredPatient = Patient(age = 25, insured = true)

  val singleTreatment = List(Diagnosis)
  val multipleTreatments = List(Diagnosis, XRay, BloodTest, ECG, Diagnosis, BloodTest)
  val singleVaccine = List(Vaccine)
  val multipleVaccines = List(Vaccine, Vaccine, Vaccine, Vaccine)

  "produceMedicalBill" should {

    "return bill amount 0.00 when given no treatments" in {

      produceMedicalBill(List(), standardPatient) shouldBe 0.00

    }

    "return correct bill amount when given a single treatment" in {

      produceMedicalBill(singleTreatment, standardPatient) shouldBe 60.00

    }

    "return correct bill amount when given multiple treatments" in {

      produceMedicalBill(multipleTreatments, standardPatient) shouldBe 626.40

    }

    "return correct bill amount when given single vaccine" in {

      produceMedicalBill(singleVaccine, standardPatient) shouldBe 42.50

    }

    "return correct bill amount when given multiple vaccines" in {

      produceMedicalBill(multipleVaccines, standardPatient) shouldBe 87.50

    }

    "apply 60% discount when customer is a senior citizen" in {

      produceMedicalBill(singleVaccine, seniorPatient) shouldBe 17.00

    }

    "apply 90% discount when customer is a senior citizen over 70" in {

      produceMedicalBill(multipleTreatments, seniorPatient70) shouldBe 62.64

    }

    "apply 40% discount when customer is a child under 5" in {

      produceMedicalBill(multipleTreatments, childPatient) shouldBe 375.84

    }

    "apply 15% discount to Blood Tests when customer is insured" in {

      produceMedicalBill(multipleTreatments, insuredPatient) shouldBe 603.00

    }

  }

}
