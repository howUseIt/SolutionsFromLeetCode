fun isPalindrome(s: String): Boolean {
    val alphaNumeric = s.replace("[^a-zA-Z0-9]".toRegex(), "").toLowerCase()
    var left = 0
    var right = alphaNumeric.length - 1
    while (left < right) {
        if (alphaNumeric[left] != alphaNumeric[right]) {
            return false
        }
        left += 1
        right -= 1
    }
    return true
}
