fun isPowerOfThree(n: Int): Boolean {
    if (n <= 0) return false
    var tempN = n
    while (tempN % 3 == 0) tempN /= 3
    return tempN == 1
}