package OOP

//الوصول الى الدول والخصائص فى الكلاسات الاخرى
//inner
 class outerClass{
    var outerName = "im outer class"

     inner class NestedClass{
         var nestedName = "im nested"

         fun printOutClassName(){
             println("$nestedName, $outerName")
         }

     }
}

fun main() {
outerClass().NestedClass().printOutClassName()
}