package com.paulofranklins.leetcode557;

import java.util.ArrayList;

class Solution {
    public String reverseWords(String s) {

        /*Option 1, re-inventing the wheel lol*/

//        var temp = new StringBuilder();
//        var list = new ArrayList<String>();
//        var rs = new ArrayList<String>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != ' ') {
//                temp.append(s.charAt(i));
//            } else {
//                list.add(temp.toString());
//                temp.delete(0, temp.length());
//            }
//        }
//        list.add(temp.toString());
//        temp.delete(0, temp.length());
//
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = list.get(i).length() - 1; j >= 0; j--) {
//                temp.append(list.get(i).charAt(j));
//            }
//            if (i < list.size() - 1) {
//                var z = temp.append(" ");
//                rs.add(z.toString());
//                temp.delete(0, temp.length());
//            } else {
//                rs.add(temp.toString());
//                temp.delete(0, temp.length());
//            }
//        }
//        for (String n : rs) {
//            temp.append(n);
//        }
//        return temp.toString();


        /*Option 2 using StringBuilder reverse.*/

        var words = s.split(" ");
        var rs = new StringBuilder();

        for (String w : words) {
            rs.append(new StringBuilder(w).reverse().append(" "));
        }
        return rs.toString().trim();
    }

    public static void main(String[] args) {
        var x = new Solution().reverseWords("Let's take LeetCode contest");
        System.out.println(x);
    }
}