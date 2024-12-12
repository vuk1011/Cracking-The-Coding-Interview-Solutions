package arrays_and_strings.urlify;

public class Test {
    public static void main(String[] args) {
        char[] charArray = {'a', ' ', 'b', ' ', 'c', 'c', ' ', 'd', 'd', 'd', ' ', ' ', ' ', ' ', ' ', ' '};
        System.out.println("Input:");
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();

        Solution1.urlify(charArray, 10);
        System.out.println("Output:");
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
