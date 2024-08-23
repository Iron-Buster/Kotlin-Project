fun main() {


    fun testList() {
        // Read only list
        val readOnlyShapes = listOf("a", "b", "c")
        println(readOnlyShapes)

        // Mutable list
        val shapes: MutableList<String> = mutableListOf("c", "d", "e")
        println(shapes)

        println("readOnlyShapes[2] is ${readOnlyShapes[2]}")
        println("readOnlyShapes[0] is ${readOnlyShapes.first()}")
        println("shapes has ${shapes.count()} items")

        println("e" in shapes)

//        shapes.forEachIndexed { index, s -> println("$index is $s") }
        shapes.add("f")
        shapes.remove("c")
        println(shapes)
    }

    fun testSet() {
        // Read only set
        val roSet = setOf(1, 2, 3)
        println(roSet)

        // Mutable set
        val set: MutableSet<Int> = mutableSetOf(0xf, 0x2f, 0x3f)
        println(set)
        // set has first() and last() fun
        // add remove as same as list
    }

    fun testMap() {
        // Read only map
        val roMap = mapOf("a" to 0, "b" to 1, "c" to 2)
        println(roMap)
        // Mutable map
        val mMap: MutableMap<String, Int> = mutableMapOf("a" to 0, "b" to 1, "c" to 2)
        println(mMap)


        println("The value of b is: ${mMap["b"]}")
        mMap["b"] = 98
        println("After re assign value, the value of b is: ${mMap["b"]}")

        mMap.remove("a")
        println(mMap)
        println(mMap.containsKey("a"))

        println(mMap.keys)
        println(mMap.values)
    }

//    testList()
//    testSet()
//    testMap()


    fun exercise1() {
        val greenNumbers = listOf(1, 4, 23)
        val redNumbers = listOf(17, 2)
        // Write your code here
        val tot = greenNumbers.count() + redNumbers.count()
        println("total: $tot")
    }
    fun exercise2() {
        val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
        val requested = "smtp"
        val isSupported = requested.uppercase() in SUPPORTED
        println("Support for $requested: $isSupported")
    }
    fun exercise3() {
        val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
        val n = 2
        println("$n is spelt as '${number2word[n]}'")
    }


    exercise1()
}



