/**
 * Question 1.4
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco eta", etc.)
 */

package arrays_and_strings.palindrome_permutation;

public class Solution1 {
    /*
    Assumptions made:
    the string is made of english letters only
     */
    static boolean isPalindromePermutation(String s) {
        if (s == null || s.isBlank()) return false;

        s = s.toLowerCase().replaceAll(" ", "");
        int length = s.length();

        // let's represent the string s as an integer whose bit values 0/1 represent if the character count is even/odd
        int counter = 0;
        for (char c : s.toCharArray()) {
            int pos = c - 'a'; // range 0-25, represents the position of a bit
            counter = counter ^ (1 << pos); // flip the bit at that position
        }

        if (length % 2 == 0) {
            // to be a palindrome, all characters must have an even amount => all counter's bits are 0s
            return counter == 0;
        } else {
            // to be a palindrome, all characters must have an even amount except one => counter has 1 bit equal to 1
            return (counter & (counter - 1)) == 0;
        }
    }
}
