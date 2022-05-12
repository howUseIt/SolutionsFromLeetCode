fun moveZeroes(nums: IntArray): Unit {
    val numsNotZeroes = nums.filter { it != 0 }
    val numsZeroes = nums.filter { it == 0 }
    var j = 0
    for (i in nums.indices) {
        if (i < numsNotZeroes.size) {
            nums[i] = numsNotZeroes[i]
        } else {
            nums[i] = numsZeroes[j++]
        }
    }
}
