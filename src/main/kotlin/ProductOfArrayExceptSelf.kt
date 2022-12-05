/**
 * 238. Product of Array Except Self
 *
 * https://leetcode.com/problems/product-of-array-except-self/
 */
fun productExceptSelf(nums: IntArray): IntArray {
    val size = nums.size
    val answer = IntArray(size)
    answer.fill(1)
    var leftProduct = 1
    var rightProduct = 1
    nums.indices.forEach {
        answer[it] *= leftProduct
        leftProduct *= nums[it]

        val rightIndex = size - 1 - it
        answer[rightIndex] *= rightProduct
        rightProduct *= nums[rightIndex]
    }

    return answer
}
