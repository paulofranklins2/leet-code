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

    public static void main(String[] args) {
        var x = new Solution().truncateSentence("Hello World Welcome To my github", 4);
        System.out.println(x);
    }
}