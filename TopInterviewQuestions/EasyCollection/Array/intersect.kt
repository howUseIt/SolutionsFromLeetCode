fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val lists = mutableListOf<Int>()
    for (i in nums1.indices) {
        for (j in nums2.indices) {
            if (nums1[i] == nums2[j]) {
                nums2[j] = -1
                lists.add(nums1[i])
                break
            }
        }
    }
    return lists.toIntArray()
}
