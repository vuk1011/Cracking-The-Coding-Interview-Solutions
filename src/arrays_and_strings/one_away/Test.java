package arrays_and_strings.one_away;

public class Test {
    public static void main(String[] args) {
        System.out.println("pale, ple -> " + Solution1.oneAway("pale", "ple"));
        System.out.println("pales, pale -> " + Solution1.oneAway("pales", "pale"));
        System.out.println("pale, bale -> " + Solution1.oneAway("pale", "bale"));
        System.out.println("pale, bake -> " + Solution1.oneAway("pale", "bake"));
    }
}
