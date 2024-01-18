package com.paulofranklins.leetcode796;

class Solution {
    public boolean rotateString(String s, String goal) {
        var chrArray = s.toCharArray();
        var sb = new StringBuilder().append(s);
        var temp = ' ';
        System.out.println(sb);

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                temp = sb.charAt(0);
                sb.delete(0, 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new Solution().rotateString("chatgpt", "chatgpt");
    }
}
