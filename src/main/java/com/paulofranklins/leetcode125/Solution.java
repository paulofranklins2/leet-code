package com.paulofranklins.leetcode125;

class Solution {
    //TODO: find better solution with lower runtime
    public boolean isPalindrome(String s) {
        var t = s.replaceAll("[^a-zA-Z0-9]", "");
        var stringBuilder = new StringBuilder();

        for (int i = 0; i < t.length(); i++) {
            stringBuilder.append(t.charAt(t.length() - 1 - i));
        }
        return String.valueOf(stringBuilder).equalsIgnoreCase(t);



    }

    public static void main(String[] args) {
        var x = new Solution().isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(x);
    }
}