package com.paulofranklins.leetcode1480;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] runningSum(int[] nums) {
        var x = new int[nums.length];
        var value = 0;
        for (int i = 0; i < nums.length; i++) {
            x[i] = (value + nums[i]);
            value += nums[i];
        }
        return x;
    }

    public static void main(String[] args) {
        var test = new Solution().runningSum(new int[]{3, 1, 2, 10, 1});
        for (Integer t : test) {
            System.out.println(t);
        }
    }
}