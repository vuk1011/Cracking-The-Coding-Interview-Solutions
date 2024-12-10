package arrays_and_strings.is_unique;

import java.util.LinkedList;

class Test {
    public static void main(String[] args) {
        LinkedList<String> testCases = new LinkedList<>();
        testCases.add(null);
        testCases.add("");
        testCases.add("a");
        testCases.add("aa");
        testCases.add("ab fg12");

        for (String s : testCases) {
            System.out.println(String.format("Case: \"%s\"", s));
            System.out.println(String.format("Solution 1: %s\tSolution 2: %s\n", Solution1.isUnique(s), Solution2.isUnique(s)));
        }
    }
}
