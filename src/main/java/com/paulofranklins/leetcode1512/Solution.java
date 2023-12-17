package com.paulofranklins.leetcode1512;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        var rs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    rs++;
                }
            }
        }

        return rs;
    }

    public static void main(String[] args) {
        var x = new Solution().numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3});
        System.out.println(x);
    }
}