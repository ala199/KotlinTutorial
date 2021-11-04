fun main(args:Array<String>) {
    val number= readLine()!!.toInt()
    when(number){
        1->{
            println("number is 1")
        }
        2->{
            println("number is 2")
        }
        3->{
            println("number is 3")
        }
        4,5->{
            println("number is 4 or 5")
        }
        in 5..20->{
            println("number is between 5..20")
        }
        else ->{
            println("out of range")
        }
    }
}