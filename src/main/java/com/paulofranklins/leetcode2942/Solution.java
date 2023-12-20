package com.paulofranklins.leetcode2942;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        var result = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++)
            if (words[i].contains(Character.toString(x))) {
                result.add(i);
            }
        return result;
    }

    public static void main(String[] args) {
        var x = new Solution().findWordsContaining(new String[]{"leet", "no", "code", "dev"}, 'e');
        System.out.println(x);
    }
}