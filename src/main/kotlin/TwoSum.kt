/**
 * 1. Two Sum
 *
 * https://leetcode.com/problems/two-sum/
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val hashmap = hashMapOf<Int, Int>()
    nums.indices.forEach {
        val otherNum = target - nums[it]
        if (hashmap.containsKey(otherNum)) {
            return intArrayOf(hashmap[otherNum]!!, it)
        }

        hashmap[nums[it]] = it
    }

    return intArrayOf()
}
