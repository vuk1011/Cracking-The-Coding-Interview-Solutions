package arrays_and_strings.string_compression;

public class Test {
    public static void main(String[] args) {
        String[] testStrings = {null, "", "a", "cc", "abab", "abbcccdddd", "ooo", "egg", "oooooh"};
        for (String s : testStrings) {
            System.out.printf("(%s) => %s%n", s, Solution1.getCompressed(s));
        }
    }
}