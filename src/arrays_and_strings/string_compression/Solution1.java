/**
 * Question 1.6
 * String Compression: Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */

package arrays_and_strings.string_compression;

class Solution1 {
    /*
    Assumptions made:
    the string only contains characters a-z, A-Z
     */
    static String getCompressed(String s) {
        if (s == null) return null;
        if (s.length() <= 2) return s;

        // using StringBuilder for more efficient string manipulation
        StringBuilder compressed = new StringBuilder();
        
        int count = 1;
        char prevChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prevChar) count++;
            else {
                compressed.append(prevChar);
                compressed.append(count);
                count = 1;
            }
            prevChar = s.charAt(i);
        }
        // not leaving out the last letter!!!
        compressed.append(prevChar);
        compressed.append(count);

        return compressed.length() < s.length() ? compressed.toString() : s;
    }
}
