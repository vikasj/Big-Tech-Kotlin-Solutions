/**
 * 217. Contains Duplicate
 *
 * https://leetcode.com/problems/contains-duplicate/
 */
fun containsDuplicate(nums: IntArray): Boolean {
    return nums.distinct().size != nums.size
}
