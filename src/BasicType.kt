import java.util.*

fun main(args: Array<String>) {
    var a: Int = 10000
    var b: Int = 10000
    var c: Int? = 10000 //nullable

    println("${a === b}") // true
    println("${a == b}") // true

    println("${a === c}") // true
    println("${a == c}") // false

    var d : Long = 30000
    // var e : Int = d --> error

    var array : Array<String> = arrayOf("테", "스", "트")
    println(array.get(0))
    println(array[1])

    var array2 = Array(5) { i -> i.toString()}

    println(Arrays.toString(array2))

    var s = "이것은 escaped string\n"
    var s2 = """이것은 raw
        | string""".trimMargin()

    println(s)
    println(s2)
}