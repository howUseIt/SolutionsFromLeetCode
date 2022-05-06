fun firstUniqChar(s: String): Int {
    val error = -1
    val map = mutableMapOf<Char, Int>()
    for (i in 0 until s.count()) {
        map[s[i]] = map[s[i]]?.plus(1) ?: 1
    }
    for (i in 0 until s.count()) {
        if (map[s[i]] == 1) {
            return i
        }
    }
    return error
}
