fun singleNumber(nums: IntArray): Int {
    val hash = HashMap<Int, Int>()
    for (i in nums.indices) {
        hash[nums[i]] = hash[nums[i]]?.plus(1) ?: 1
    }
    for (i in nums.indices) {
        if (hash[nums[i]] == 1) return nums[i]
    }
    return 0
}
