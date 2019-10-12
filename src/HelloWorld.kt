import javax.swing.text.html.HTML.Tag.I

fun main(args: Array<String>) {
    println("Hello World!")

    println(add(1, 2))
    println(modi(4, 2))

    val a : Int = 1
    var b : Int = 2
    // a = 2 --> error
    b = 3
    println("b : $b")
    var c = 3
    var d = "c is $c"
    var e = "${d.replace("is", "was")} --> is replaced was"
    println(d)
    println(e)

    println("스트링길이 : " + getStringLength("가나다"))

    collection()
}

fun add(a: Int, b: Int) : Int {
    return a + b
}

fun modi(a :Int, b: Int) = a / b

fun getStringLength(s : Any) : Int ?{
    println("============")
    if (s is String){
        return s.length
    }

    return null
}

fun collection(){
    println("============")
    var items = listOf(1, 2, 3)

    for (item in items){
        println(item)
    }

    if (2 in items){
        println("2 is contain items!")
    }
}



