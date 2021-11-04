package OOP

//1-انشاء متغير يدون اغطاءة قيمة abstract
//2-انشاء دالة يدون اغطاءة قيمة الكلاس الذى يرث هو الذى بحدد
//مهم ... interface هو نفس مفهموم abstract ولكن اكثر مرونة
abstract class Animal {
    abstract var age: Int

    abstract fun makeSound()
}

class Cat : Animal() {
    override var age: Int = 5

    override fun makeSound() {
        println("meow")
    }
}

fun main() {
    var kitty=Cat()
    println(kitty.age)

    kitty.makeSound()

}