package com.paulofranklins.leetcode217;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        var hashSet = new HashSet<Integer>();

        for (int num : nums) {
            if (hashSet.contains(num)) {
                hashSet.add(num);
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