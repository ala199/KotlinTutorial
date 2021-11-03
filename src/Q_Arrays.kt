fun main() {
    //There are two ways to define an array in Kotlin
    // declaring an array using arrayOf()
    val arrayname = intArrayOf(1, 2, 3, 4, 5)
    for (i in 0..arrayname.size-1)
    {
        print(" "+arrayname[i])
    }


}