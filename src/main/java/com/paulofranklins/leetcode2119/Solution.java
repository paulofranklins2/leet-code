package com.paulofranklins.leetcode2119;

class Solution {
    public boolean isSameAfterReversals(int num) {

        //        Beats 7%
        /*
        var firstReverse = new StringBuilder().append(num).reverse();
        var y = Integer.valueOf(firstReverse.toString());
        var secondReverse = new StringBuilder().append(y).reverse();
        return Integer.parseInt(secondReverse.toString()) == num;
        */

        //        Beats 100%
        var s = String.valueOf(num);
        if (s.length() != 1) {
            return s.charAt(s.length() - 1) != '0';
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        var x = new Solution().isSameAfterReversals(1800);
        System.out.println(x);
    }
}