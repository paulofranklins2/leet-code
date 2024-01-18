package com.paulofranklins.leetcode2114;

class Solution {
    public int mostWordsFound(String[] sentences) {
        var result = Integer.MIN_VALUE;

        for (String sentence : sentences) {
            var wordsLength = sentence.split(" ").length;
            if (result < wordsLength) {
                result = wordsLength;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(
                new Solution().mostWordsFound(new String[]{
                        "leet code is the best",
                        "i haven't been here for some time",
                        "dogs are lovely",
                        "can't say the same about cats"
                })
        );
    }
}