package org.example;

class DetectCapitalUse {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }
        var firstLower = Character.isLowerCase(word.charAt(0));
        var secondLower = Character.isLowerCase(word.charAt(1));

        if (!firstLower) {
            for (int i = 2; i < word.length(); i++) {
                if (Character.isLowerCase(word.charAt(i)) != secondLower) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        DetectCapitalUse s = new DetectCapitalUse();
        System.out.println(s.detectCapitalUse("aafSsfq"));
    }
}