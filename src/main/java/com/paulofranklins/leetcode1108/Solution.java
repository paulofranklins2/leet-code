package com.paulofranklins.leetcode1108;

class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

    public static void main(String[] args) {
        var x = new Solution().defangIPaddr("1.1.1.1");
        System.out.println(x);
    }
}