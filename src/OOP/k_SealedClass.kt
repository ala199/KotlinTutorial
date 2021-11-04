package OOP

//من خلاله اتحكم فى الكلاسات التى ترث الكلاس الاساسى
sealed class Sample {
    open class A:Sample(){}
}

class test:Sample.A()

