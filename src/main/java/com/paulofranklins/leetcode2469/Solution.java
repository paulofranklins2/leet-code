package com.paulofranklins.leetcode2469;

import java.util.Arrays;

class Solution {
    public double[] convertTemperature(double celsius) {
        var k = celsius + 273.15;
        var f = (celsius * 9 / 5) + 32;
        return new double[]{k, f};
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(new Solution()
                        .convertTemperature(36.9))
        );
    }
}


