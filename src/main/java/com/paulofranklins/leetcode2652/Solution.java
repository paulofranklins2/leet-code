package com.paulofranklins.leetcode2652;

class Solution {
    public int sumOfMultiples(int n) {
        var rs = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                rs += i;
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        var x = new Solution().sumOfMultiples(7);
        System.out.println(x);
    }
}