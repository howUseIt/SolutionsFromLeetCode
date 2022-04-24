fun missingNumbers(nums: IntArray): Int {
    var j = 0
    nums.sort()
    for (element in nums) {
        if (j == element) {
            j++
        } else {
            return j
        }
    }
    return j
}
