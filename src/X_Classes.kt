class MainCar(Type:String,Model:Int,Prise:Int){
    init { //دالة تستدعى بشكل تلقائى بمجرد عمل instance من  ال Class
        println("Type:$Type")
        println("Model:$Model")
        println("Prise:$Prise")
    }
}

fun main() {
    val car1=MainCar("BMW",2016,200403)
    val car2=MainCar("serato",2015,233025)
    val car3=MainCar("jaguar",2014,856200)
}