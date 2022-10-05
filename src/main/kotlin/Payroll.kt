import java.lang.Exception

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        for (person in allEmployees) {
            println("${person.name} get ${person.salary * 12} annually")
        }
    }
}