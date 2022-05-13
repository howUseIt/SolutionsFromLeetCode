fun rotate(nums: IntArray, k: Int): Unit {
    val duplicateNums = nums.clone()
    for (i in nums.indices) {
        val index = (i + k) % nums.size
        nums[index] = duplicateNums[i]
    }
}
