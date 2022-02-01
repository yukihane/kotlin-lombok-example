package example

fun main() {
    val obj = MyJavaClass()
    println(obj.message)

    val v = MyValue.of(10)
    println(v.value.toString())
}