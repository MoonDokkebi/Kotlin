package chap02.section2

fun main() {
    val number =10;
    var language = "Korean"
    val secondNumber: Int = 20
    language ="English"

    println("number : $number")
    println("language : $language ")
    println("secondNumber: $secondNumber")

    var num: Double =0.1
    for(x in 0..99){
        num += 0.1
    }
    println(num)

    var a = 1
    var str1 = "a= $a"
    var str2 = "s= ${a+2}"

    println("str1: \"$str1\", str2: \"%str2\"")


    val N =10
    val formattedString = """
        var a= 6
        var b= "kotlin"
        println(a + N)
        """
    println(formattedString)
}
