/**
 * Question 1.5
 * One Away: There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */

package arrays_and_strings.one_away;

class Solution1 {
    static boolean oneAway(String s1, String s2) {
        if (s1 == null || s2 == null) throw new IllegalArgumentException("Strings can't be null.");
        if (s1.equals(s2)) return true;
        if (s1.length() + s2.length() <= 1) return true; // for empty strings
        if (Math.abs(s1.length() - s2.length()) > 1) return false;

        // get shorter and longer string
        String str1 = s1.length() < s2.length() ? s1 : s2;
        String str2 = s1.length() < s2.length() ? s2 : s1;

        int index1 = 0, index2 = 0;
        boolean foundDifference = false;
        while (index1 < str1.length() && index2 < str2.length()) {
            if (str1.charAt(index1) != str2.charAt(index2)) {
                if (foundDifference) return false;
                foundDifference = true;

                if (str1.length() == str2.length()) {
                    index1++;
                }
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }
}
