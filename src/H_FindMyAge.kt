import java.util.*

fun main() {
    var yearOfBirth:Int = readLine()!!.toInt()

    var currentYear = Calendar.getInstance().get(Calendar.YEAR)

    var age = currentYear-yearOfBirth

    println("your age is $age")
    println(currentYear)
}