fun removeDuplicates(nums: IntArray): Int {
    var elem = nums[0]
    var k = 1
    for (i in 1 until nums.size) {
        if (nums[i] != elem) {
            elem = nums[i]
            nums[k++] = nums[i]
        }
    }
    return k
}
