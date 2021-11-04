fun main() {
    //Return Function
    println(retur(9,10))
    //No Return Function
    noReturn(8,7)
}

fun retur(z : Int,x : Int):Int{
    val oppVal=z*x
    return oppVal
}

fun noReturn(z:Int,x:Int){
    println(z-x)
}
