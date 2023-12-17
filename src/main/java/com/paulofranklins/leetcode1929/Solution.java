package com.paulofranklins.leetcode1929;

class Solution {
    public int[] getConcatenation(int[] nums) {
        var rs = new int[nums.length * 2];
        var index = 0;

        System.arraycopy(nums, 0, rs, 0, nums.length);
        for (int i = nums.length; i < rs.length; i++) {
            rs[i] = nums[index];
            index++;
        }
        return rs;
    }

    public static void main(String[] args) {
        var x = new Solution().getConcatenation(new int[]{1, 2, 1});
        for (int z : x) {

            System.out.println(z);
        }
    }
}