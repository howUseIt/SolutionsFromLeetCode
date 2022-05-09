fun romanToInteger(s: String): Int {
    val map = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var value = 0
    for (i in s.indices) {
        if (i + 1 < s.count() && map[s[i]]!! < map[s[i + 1]]!!) {
            value -= map[s[i]]!!
        } else {
            value += map[s[i]]!!
        }
    }
    return value
}
