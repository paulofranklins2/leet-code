package com.paulofranklins.leetcode771;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        var result = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == (stones.charAt(j))) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numJewelsInStones("aA", "AAa"));
    }
}
