package arrays_and_strings.string_rotation;

class Test {
    public static void main(String[] args) {
        String[] firstTestString = {"waterbottle", "castle", "management", "banana"};
        String[] secondTestString = {"ttlewaterbo", "stleca", "maneggment", "nanana"};

        for (int i = 0; i < firstTestString.length; i++) {
            System.out.printf("(%s, %s) -> %s\n", firstTestString[i], secondTestString[i], Solution1.isRotation(firstTestString[i], secondTestString[i]));
        }
    }
}
