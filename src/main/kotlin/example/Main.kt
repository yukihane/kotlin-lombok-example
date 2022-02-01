package example

fun main() {
    // https://youtrack.jetbrains.com/issue/KT-50013
    val obj = MyJavaClass()
    println(obj.message)

    // https://youtrack.jetbrains.com/issue/KT-51092
    val v = MyValue(10)
    println(v.value)
}
