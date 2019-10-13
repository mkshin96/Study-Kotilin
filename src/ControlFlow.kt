fun main(args: Array<String>) {
    println(getBigger(1, 2))
    println(getBigger2(2, 1))
    println(booleanSwitch(3))
    println(booleanSwitch2("String"))
    println(booleanSwitch2(1))
    println(forLoop(arrayOf("가", "나", "다")))
    println(whileLoop(arrayOf("가", 1, 'a', "나")))
}

@Description("if문이 식으로 사용되는 경우 값을 반환함, if식의 경우 반드시 else를 동반해야함")
fun getBigger(a: Int, b : Int) : Int {
    var bigger = if (a > b) a else b
    return bigger
}

@Description("if문이 식으로 사용되는 경우 값을 반환함, if식의 경우 반드시 else를 동반해야함")
fun getBigger2(a: Int, b : Int) : Int {
    var bigger = if (a > b) {
        println("a bigger than b")
        a
    } else {
        println("b bigger than a")
        b
    }
    return bigger
}

@Description("java switch --> kotlin when")
fun booleanSwitch(i: Int): Any? {
    var array = arrayOf(3, 6, 9)

    return when(i){
        1, 2 -> true
        3 -> false
        in array -> false
        else -> {
            false
        }
    }
}

@Description("java switch --> kotlin when2")
fun booleanSwitch2(i : Any?) : Boolean{
    when {
        i is String -> return true
        else -> return false
    }
}

fun forLoop(array: Array<String>) {
    println("===========")
    for (index in array.indices){
        println(index)
    }

    for (index in array){
        println(index)
    }

    for ((index, value) in array.withIndex()){
        println("$index : $value")
    }
}

fun whileLoop(array: Array<Any?>) {
    println("===========")

    var x = 0
    while (!x.equals(array.size)){
        println("x : ${array[x]}")
        x++
    }
}


