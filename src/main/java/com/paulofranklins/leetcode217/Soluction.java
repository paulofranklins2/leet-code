package com.paulofranklins.leetcode217;

import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {

            if (!map.containsValue(nums[i])) {
                map.put(i, nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        var solution = new Solution();
        var result = solution.containsDuplicate(new int[]{0, 4, 5, 0, 3, 6});
        System.out.println(result);
    }
}