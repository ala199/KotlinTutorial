package OOP

//يمكنك ان تصل الى دالة او متغير فى كلاس اخر بدون ان تأخذ object من هذا الكلاس

open class A{
    companion object{
        fun test(){
            println("ti's easy with companion")
        }
    }
}

fun main() {
    A.test()
}