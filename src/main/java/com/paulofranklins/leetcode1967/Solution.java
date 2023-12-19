package com.paulofranklins.leetcode1967;

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        var rs = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])){
                rs++;
            }
        }
        return rs;
    }
}