package example

fun main() {
    // https://youtrack.jetbrains.com/issue/KT-50013
    val obj = MyJavaClass()
    println(obj.message)

    val v = MyValue.of(10)
    println(v.value.toString())
}