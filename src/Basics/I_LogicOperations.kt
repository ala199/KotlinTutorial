fun main(args:Array<String>) {
// < , > , <= , >= , == < !=

            // AND
    //       f  &&   f  = false
    println(3>10 && 2>3)

    //       t  &&   f  = false
    println(3<10 && 2>3)

    //       t  &&   t  = true
    println(3<10 && 2<3)


               //OR
    //       f  ||   f  = false
    println(3>10 || 2>3)

    //       t  &&   f  = true
    println(3<10 || 2>3)

    //       t  &&   t  = true
    println(3<10 || 2<3)


             //NOT = Reverse
    var isMarried = false
    println(!isMarried)
    //              t          ||          f        = t
    println((10>=10 && 10<=10) || (10>=70 && 10<=5))
}