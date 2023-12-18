package com.paulofranklins.leetcode1816;

class Solution {
    public String truncateSentence(String s, int k) {
        char x = ' ';
        var counter = 0;
        var builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                counter++;
            }
            if (counter < k) {
                builder.append(Character.toString(s.charAt(i)));
            }
        }
        return String.valueOf(builder);
    }
}