package com.paulofranklins.leetcode1351;

class Solution {
    public int countNegatives(int[][] grid) {
        var rs = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt < 0) {
                    rs++;
                }
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        var x = new Solution().countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}});
        System.out.println(x);
    }
}