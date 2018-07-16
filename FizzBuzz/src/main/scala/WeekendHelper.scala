import java.util.Calendar

object WeekendHelper extends WeekendHelper

  trait WeekendHelper {

    def isWeekend: Boolean = {

      val now = Calendar.getInstance()
      val currentDay = now.get(Calendar.DAY_OF_WEEK)

      currentDay >5

      }

  }
