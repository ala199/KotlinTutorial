package OOP

open class person {
    var name: String? = null

    fun getInfo() {
        println("Name $name ** it's from function")
    }
}

class doctor : person() {}

fun main() {
    val doc1 = doctor()
    //Attribute
    doc1.name="ali"
    println(doc1.name)
    //Function
    doc1.getInfo()

}