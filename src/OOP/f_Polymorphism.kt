package OOP

//overriding مبدأ من مبادئ polymorphism

open class Calculator{
    open fun calculate(num1:Int,num2:Int){
        print(num1+num2)
    }
    open fun calculate(num1:Float,num2:Int){
        print(num1-num2)
    }
}
class Operation:Calculator(){
    override fun calculate(num1: Int, num2: Int) {
//        super.calculate(num1, num2) *** هذه العملية فى الكلاس الاساسى
        print(num1*num2)
    }

    override fun calculate(num1: Float, num2: Int) {
        print(num1/num2)
    }
}