package lesson2

fun main() {
    val numberOfPermanentEmployees = 50
    val salaryPerPerson = 30000

    val numberOfInterns = 30
    val salaryPerInterns = 20000


    var generalExpensesEmployees = numberOfPermanentEmployees * salaryPerPerson

    var totalExpensesOfAll = generalExpensesEmployees + (numberOfInterns * salaryPerInterns)

    var averageSalary = totalExpensesOfAll / (numberOfPermanentEmployees + numberOfInterns)

    println("Расходы на выплату зарплаты постоянных сотрудников: $generalExpensesEmployees рублей")
    println("Общие расходы по ЗП после прихода стажеров: $totalExpensesOfAll рублей")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $averageSalary рублей")

}