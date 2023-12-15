package com.paulofranklins.leetcode1672;

class Solution {
    public int maximumWealth(int[][] accounts) {
        var result = 0;
        var t = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                t += accounts[i][j];
                if (t > result) {
                    result = t;
                }
            }
            t = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        var x = new Solution().maximumWealth(new int[][] {{1, 2, 3}, {3, 2, 1}});
        System.out.println(x);
    }
}
