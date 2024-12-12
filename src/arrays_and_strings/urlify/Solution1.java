/**
 * Question 1.3
 * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string. (Note: If implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 * <p>
 * EXAMPLE
 * Input: "Mr John Smith ", 13
 * Output: "Mr%20John%20Smith"
 */

package arrays_and_strings.urlify;

class Solution1 {
    /*
    Assumptions made:
    the string doesn't start with a space and has no multiple spaces between letters
     */
    static void urlify(char[] string, int trueLength) {
        int lastIndex = trueLength - 1;

        for (int i = trueLength - 1; i > 0; i--) {
            if (string[i] != ' ') continue;

            // make 2 new spaces
            for (int j = lastIndex; j > i; j--) {
                string[j + 2] = string[j];
                string[j] = ' ';
            }

            // populate empty space with "%20"
            string[i] = '%';
            string[i + 1] = '2';
            string[i + 2] = '0';

            // adjust lastIndex
            lastIndex += 2;
        }
    }
}
