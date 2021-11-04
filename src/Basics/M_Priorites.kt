/*
Operation rules | priorites rules

1- ()
2- ^
3- *,/
4- +,-
5- =
*/

fun main() {
    val n1=10
    val n2=20
    val n3=5
    var sum:Int?=null

    sum=n1+n2*n3-3/5
    println(sum)
}