package chap02.section3

fun main() {
    var str1 : String? = "HelloKotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length}")

    var len = if(str1 != null) str1.length else -1
    //==${str1?.length ?: -1}

    println("str1: $str1 length: ${len}")
    println("str1: $str1 length:${str1?.length ?: -1}")

    checkArg("Hello")
    checkArg("5")
}
fun checkArg(x : Any){
    if (x is String)
        println("x is String: $x")
    if (x is Int)
        println("x is Int: $x")
}