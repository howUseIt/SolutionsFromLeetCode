fun isAnagram(s: String, t: String): Boolean {
    if (s.count() != t.count()) return false
    var i = 0
    val s1 = s.toCharArray().sorted()
    val t1 = t.toCharArray().sorted()
    while (i < s.count())  {
        if (s1[i] != t1[i]) {
            return false
        }
        i++
    }
    return true
}
