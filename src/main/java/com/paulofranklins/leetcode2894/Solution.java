package com.paulofranklins.leetcode2894;

class Solution {
    public int differenceOfSums(int n, int m) {
        var isDivisible = 0;
        var notDivisible = 0;

        for (int i = 1; i <= n; i++)
            if (i % m == 0) isDivisible += i;
            else notDivisible += i;
        return notDivisible - isDivisible;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().differenceOfSums(10, 3));
    }
}
