package com.paulofranklins.leetcode2011;

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        var x = 0;
        for (String operation : operations) {
            if (operation.contains("--")) {
                x--;
            } else {
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        var x = new Solution().finalValueAfterOperations(new String[]{"--X","X++","X++"});
        System.out.println(x);
    }
}