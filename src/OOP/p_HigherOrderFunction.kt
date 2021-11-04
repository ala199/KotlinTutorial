package OOP

//دالة تستقبل دالة أخرى كبراميتر

fun add(n1:Int,n2:Int):Int{
    return n1+n2
}

val lambda={x:Int,y:Int->x*y}

fun printTwoNumbers(func:(num1:Int,num2:Int)->Int){
    println(func(10,2))
}


fun main() {
    printTwoNumbers(::add)
    printTwoNumbers(lambda)
}