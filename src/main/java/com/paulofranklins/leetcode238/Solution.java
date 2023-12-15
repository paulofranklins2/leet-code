package com.paulofranklins.leetcode238;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        var right = new int[nums.length];
        var left = new int[nums.length];
        var answer = new int[nums.length];

        var counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != counter) {
                var x = right[i] = nums[i] * right[i];
                System.out.println(x);
            }
        }

        return answer;
    }

}