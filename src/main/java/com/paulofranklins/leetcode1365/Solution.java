package com.paulofranklins.leetcode1365;

import java.util.HashSet;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        var rs = new int[nums.length];
        var temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {
                if (nums[i] > num) {
                    temp++;
                }
            }
            rs[i] = temp;
            temp = 0;
        }
        return rs;
    }

    public static void main(String[] args) {
        new Solution().smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
    }
}