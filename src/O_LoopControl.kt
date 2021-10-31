fun main() {

//    for (count in 1..10){
//        println(count)
//        if (count==5){
//            println(count)
//            break
//        }
//        if (count==4){
//            println(count)
//            break
//        }
//    }

//    for (count in 1..10){
//        if (count==5){
//            continue
//        }
//        println(count)
//    }

    loop@ for (count in 1..10){
        for (count in 1..5){
            println(count)
            if (count==5){
                break@loop
            }
        }
    }
}