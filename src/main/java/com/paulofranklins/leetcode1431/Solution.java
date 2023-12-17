package com.paulofranklins.leetcode1431;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var val = 0;
        var rs = new ArrayList<Boolean>();

        for (int x : candies) {
            if (x > val) val = x;
        }
        for (int candy : candies) {
            rs.add((candy + extraCandies) >= val);
        }
        return rs;
    }

    public static void main(String[] args) {
        var x = new Solution().kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        System.out.println(x);
    }
}