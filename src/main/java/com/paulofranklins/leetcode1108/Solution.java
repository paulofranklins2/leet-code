package com.paulofranklins.leetcode1108;

class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

    public char[] defangIPaddr(char[] address) {
        var z = new char[address.length + 6];
        var addressIndex = 0;

        for (int i = 0; i < z.length; ) {
            if (address[addressIndex] != '.') {
                z[i] = address[addressIndex];
                i++;
                if (addressIndex < address.length - 1) {
                    addressIndex++;
                }
            }

            if (address[addressIndex] == '.') {
                z[i] = '[';
                i++;
                z[i] = '.';
                i++;
                z[i] = ']';
                i++;
                if (addressIndex < address.length - 1) {
                    addressIndex++;
                }
            }
        }
        return z;
    }

    public static void main(String[] args) {
        var x = new Solution().defangIPaddr("1.1.1.1");
        System.out.println(x);

        var z = new Solution().defangIPaddr(new char[]{'1', '.', '1', '.', '1', '.', '1'});
        for (char c : z) {
            System.out.print(c);
        }
    }

}

