package OOP

//private, public, protected, internal

open class Car{
    private var model:String?=null
    var color:String?=null
    protected open var price:Int?=888 //must to Open class and attribute
    internal var speed:Double?=null
}

class mercedes:Car{
    //معنى انه سوف نقوم بأعطاء قيمة جديدة للمتغير override
    override var price: Int?= 1000
    constructor(){
        println(price)
    }
}

fun main() {
var mer=mercedes()
    println(mer)

    mer.speed=53.5
}