package com.namanh.array

/**
 * https://leetcode.com/problems/concatenation-of-array
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and
 * ans[i + n] == nums[i] for 0 <= i < n (0-indexed). Specifically, ans is the concatenation of two nums arrays.
 * Return the array ans.
 */
object ConcatenationOfArray {
    fun getConcatenation(nums: IntArray): IntArray {
        val n = nums.size
        return IntArray(n * 2) {
            if (it < n) nums[it] else nums[it - n]
        }
    }
}