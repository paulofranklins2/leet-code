package com.paulofranklins.leetcode121;

import java.util.HashSet;

class Solution {
    public int maxProfit(int[] prices) {

        var minValue = Integer.MAX_VALUE;
        var maxProfit = 0;

        for (int price : prices) {
            if (price < minValue) {
                minValue = price;
            } else if (price - minValue > maxProfit) {
                maxProfit = price - minValue;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}