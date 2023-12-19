package com.paulofranklins.leetcode2427;

class Solution {
    public int commonFactors(int a, int b) {
        var rs = 0;
        var maxNum = Math.max(a, b);

        for (int i = 1; i <= maxNum; i++) {
            if (a % i == 0 && b % i == 0) {
                rs++;
            }
        }
        return rs;
    }
}