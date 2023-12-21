package com.paulofranklins.leetcode657;

class Solution {
    public boolean judgeCircle(String moves) {
        int leftRight = 0;
        int upDown = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    upDown++;
                    break;
                case 'D':
                    upDown--;
                    break;
                case 'L':
                    leftRight++;
                    break;
                default:
                    leftRight--;
                    break;
            }
        }
        return leftRight == 0 && upDown == 0;
    }

    public static void main(String[] args) {
        var x = new Solution().judgeCircle("LDRRLRUULR");
        System.out.println(x);
    }
}