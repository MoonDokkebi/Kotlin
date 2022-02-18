package chap02.section1

import com.example.edu.person
import java.lang.Math.PI
import java.lang.Math.abs
import com.example.edu.person as User

class `ch02-01` {
    fun main() {
        val intro:String = "안녕하세요!"
        val num: Int = 20

        println("intro : $intro, num: $num")

        println(PI)
        println(abs(-12.6))

        val user1 = User("kildong", 30)
        println(user1.name)
        println(user1.age)


    }
}
