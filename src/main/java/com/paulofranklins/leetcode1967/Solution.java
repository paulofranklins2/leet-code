package com.paulofranklins.leetcode1967;

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        var rs = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                rs++;
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        var x = new Solution().numOfStrings(new String[]{"a", "abc", "bc", "d"}, "abc");
        System.out.println(x);
    }
}