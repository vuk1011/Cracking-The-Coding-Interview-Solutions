/**
 * Question 1.1
 * Is Unique: Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */

package arrays_and_strings.is_unique;

import java.util.HashSet;

class Solution1 {
    // With an additional data structure

    protected static boolean isUnique(String s) {
        if (s == null || s.isEmpty()) return false;

        HashSet<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (uniqueChars.contains(c)) return false;
            else uniqueChars.add(c);
        }

        return true;
    }
}
