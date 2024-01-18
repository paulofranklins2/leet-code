package com.paulofranklins.leetcode2535;

import java.util.Arrays;

import static java.lang.Character.getNumericValue;

class Solution {
    public int differenceOfSum(int[] nums) {
        var elementSum = 0;
        var digitSum = 0;
        var charArray = Arrays.toString(nums).toCharArray();
        for (char c : charArray) {
            var value = Character.getNumericValue(c);
            if (value != -1) digitSum += value;
        }
        for (int num : nums) {
            elementSum += num;
        }
        return elementSum - digitSum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().differenceOfSum(new int[]{1, 15, 6, 3}));
    }
}

