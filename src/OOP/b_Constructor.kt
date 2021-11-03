package OOP

//عبارة عن دالة تنفذ عندما نعمل object من ال class

class Teacher {
    constructor(salary: Int){println(salary)}
    constructor(salary: Double){ println(salary) }
    constructor(salary: Float){println(salary)}

}

fun main(args: Array<String>) {

    val TechSalary=Teacher( 250)
    println(TechSalary)

}