package com.paulofranklins.leetcode219;

class Solution {
    public int[] separateDigits(int[] nums) {
        var sBuilder = new StringBuilder();
        for (int num : nums) {
            sBuilder.append(num);
        }
        var rs = new int[sBuilder.length()];
        for (int i = 0; i < sBuilder.length(); i++) {
            rs[i] = Integer.parseInt(String.valueOf(sBuilder.charAt(i)));
        }
        return rs;
    }

    public static void main(String[] args) {
        var x = new Solution().separateDigits(new int[]{13, 25, 83, 77});
        System.out.println(x);
    }
}