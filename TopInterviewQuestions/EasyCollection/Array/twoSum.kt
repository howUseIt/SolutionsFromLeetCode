fun twoSum(nums: IntArray, target: Int): IntArray {
    var i = 0
    while (i < nums.size) {
        var j = 0
        while (j < nums.size) {
            if (nums[i] + nums[j] == target && i != j) {
                return intArrayOf(i, j)
            }
            ++j
        }
        ++i
    }
    return intArrayOf(0, 0)
}s