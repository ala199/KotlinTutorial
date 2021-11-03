package OOP

class Person {
    //Attributes
    var name: String? = null
    var id: Int? = null

    //Functions
    fun walk() {
        println(name)
    }
    fun sleep() {
        println(id)
     }
}

//create object from class person
fun main(args: Array<String>) {
    var student=Person()
    //Attributes
    student.id=1
    student.name="ali"
    //Functions
    student.walk()
    student.sleep()
}