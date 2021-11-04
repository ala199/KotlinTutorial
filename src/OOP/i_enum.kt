package OOP
//ليس مفهموم محتواه .. كلاس يوجد به بعض الدوال يجب استكشافها والاستفادة منها
enum class Days(val isWeekEnd:Boolean=false){
    SUNDAY(true), MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY(true)
}

fun main() {
    for (day in Days.values()){
        println("${day.ordinal} = ${day.name}")
    }
}