fun plusOne(digits: IntArray): IntArray {
    var intValue = digits.joinToString("").toBigInteger()
    ++intValue
    val nArray = intValue.toString().split("")
    val outArray = mutableListOf<Int>()
    for (n in nArray) {
        if (n.isNotEmpty()) {
            outArray.add(n.toInt())
        }
    }
    return outArray.toIntArray()
}