fun main() {
    // if
    fun testIf() {
        val d: Int
        val check = true
        if (check) {
            d = 1
        } else {
            d = 2
        }
        println(d)

        val a = 1
        val b = 2
        println(if (a > b) a else b)
    }

    // when
    fun testWhen() {
        val s = "1"
        when (s) {
            "1" -> println("one")
            "2" -> println("two")
            else -> println("0xf")
        }
        val res = when (s) {
            "1" -> "one"
            "2" -> "two"
            else -> "0xf"
        }
        println(res)
        val state = 1
        val ans = when {
            state == 1 -> "one"
            state == 2 -> "two"
            else -> "0xf"
        }
        println(ans)
    }


    // loops
    fun testLoops() {
        for (x in 1..5) {
            println(x)
        }

        val cakes = listOf("carrot", "cheese", "chocolate")
        for (cake in cakes) {
            println("Yummy, it's a $cake cake!")
        }
    }

    // while
    fun testWhile() {
        var x = 0
        while (x < 3) {
            println("Eat a cake")
            x++
        }
    }


}
