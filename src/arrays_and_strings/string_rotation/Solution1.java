/**
 * Question 1.9
 * String Rotation: Assume you have a method isSubstring which checks if one word is a substring
 * of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
 * call to isSubstring (e.g., "waterbottle" is a rotation of "erbottlewat").
 */

package arrays_and_strings.string_rotation;

class Solution1 {
    private static boolean isSubstring(String s1, String s2) {
        /*
        Checks if s1 is a substring of s2
         */
        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            if (s1.equals(s2.substring(i, i + s1.length()))) return true;
        }
        return false;
    }

    static boolean isRotation(String s1, String s2) {
        /*
        Checks if s1 is a rotation of s2
         */
        if (s1 == null || s2 == null || s1.isBlank() || s2.isBlank()) return false;
        if (s1.length() != s2.length()) return false;
        if (s1.equals(s2)) return true;
        /*
        Idea - if we concatenate a string with itself, the result will have all possible rotations as substrings
        waterbottle x2 = waterboTTLEWATERBOttle
        ttlewaterbo x2 = ttleWATERBOTTLEwaterbo
         */
        return isSubstring(s1, s2 + s2);
    }
}
