fun main(args:Array<String>) {
    println("enter number between 0..10")
    var number = readLine()!!.toInt()
    if ( number >= 9 && number<=10){
        println("Very good")
    }else if (number >= 5 && number<=8){
        println(" good")
    }else{
        println("not bad")
    }
}