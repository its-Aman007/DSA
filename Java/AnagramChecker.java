import java.util.HashSet;

public class AnagramChecker {
    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";

        boolean areAnagrams = checkAnagrams(string1, string2);

        if (areAnagrams) {
            System.out.println("'" + string1 + "' and '" + string2 + "' are anagrams!");
        } else {
            System.out.println("'" + string1 + "' and '" + string2 + "' are not anagrams.");
        }
    }

    public static boolean checkAnagrams(String s1, String s2) {
        // Create HashSet for each string
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        // Add characters from s1 to set1
        for (char c : s1.toCharArray()) {
            set1.add(c);
        }

        // Add characters from s2 to set2
        for (char c : s2.toCharArray()) {
            set2.add(c);
        }

        // Check if the sets are equal
        return set1.equals(set2);
    }
}
