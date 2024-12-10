/**
 * Question 1.1
 * Is Unique: Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */

package arrays_and_strings.is_unique;

class Solution2 {
    // Without an additional data structure

    protected static boolean isUnique(String s) {
        if (s == null || s.isEmpty()) return false;

        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (c == s.charAt(j)) return false;
            }
        }

        return true;
    }
}
