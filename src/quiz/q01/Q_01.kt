package quiz.q01
//문제 : 잆력값이 null 이거나 빈칸이면  입력없음 출력
fun main() {
    val input = readlnOrNull()

    if (input.isNullOrBlank()) println("입력없음")
    else println(input)

    println(input.takeIf { !it.isNullOrBlank() } ?: "입력없음")
    //이건 상급자
}
