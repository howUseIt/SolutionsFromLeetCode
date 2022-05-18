fun reverse(x: Int): Int {
    val tempIntValue = kotlin.math.abs(x).toString().reversed()
    return try {
        if (x > 0) {
            tempIntValue.toInt()
        } else {
            tempIntValue.toInt() * (-1)
        }
    } catch (e: java.lang.Exception) {
        0
    }
}