package com.paulofranklins.leetcode121;

class Solution {
    public int maxProfit(int[] prices) {
        var maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    if (prices[j] - prices[i] > maxProfit) {
                        maxProfit = prices[j] - prices[i];

                    }
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}