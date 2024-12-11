/**
 * Question 1.2
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 */

package arrays_and_strings.check_permutation;

import java.util.Arrays;

class Solution1 {
    /*
    Assumptions made:
    the strings are ASCII strings, meaning each character can be represented by a byte
     */
    private static class CharCounter {
        public int[] counterArray;

        public CharCounter(String s) {
            counterArray = new int[256];
            for (int i = 0; i < s.length(); i++) {
                counterArray[s.charAt(i)]++;
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            CharCounter cc = (CharCounter) obj;
            return Arrays.equals(counterArray, cc.counterArray);
        }
    }

    static boolean checkPermutation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) return false;
        if (s1.length() != s2.length()) return false;

        CharCounter cc1 = new CharCounter(s1);
        CharCounter cc2 = new CharCounter(s2);
        return cc1.equals(cc2);
    }
}
