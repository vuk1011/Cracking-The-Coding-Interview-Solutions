package arrays_and_strings.check_permutation;

import java.util.LinkedList;

class Test {
    private static class TestCase {
        public String testString1;
        public String testString2;
        public boolean expectedResult;

        public TestCase(String s1, String s2, boolean expectedResult) {
            testString1 = s1;
            testString2 = s2;
            this.expectedResult = expectedResult;
        }
    }

    public static void main(String[] args) {
        LinkedList<TestCase> testCases = new LinkedList<>();
        testCases.add(new TestCase(null, "a", false));
        testCases.add(new TestCase("", "dog", false));
        testCases.add(new TestCase("cat", "lion", false));
        testCases.add(new TestCase("abcd", "dcba", true));
        testCases.add(new TestCase("xyy", "xxy", false));

        int i = 1;
        for (TestCase tc : testCases) {
            boolean passed = Solution1.checkPermutation(tc.testString1, tc.testString2) == tc.expectedResult;
            String passedStr = passed ? "successful" : "failed";
            System.out.println(String.format("Test %d : %s", i, passedStr));
            i++;
        }
    }
}
