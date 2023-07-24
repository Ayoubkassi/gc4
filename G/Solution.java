import java.util.HashMap;
import java.util.Map;

class Solution {

    private final static String ANAGRAM = "Awesome anagram";
    private final static String NOT_ANAGRAM = "Azuz is not my leader";

    private static boolean isAnagrams(String a, String b) {
        Map<Character, Integer> map = new HashMap<>();
        if (a.length() != b.length())
            return false;

        for (char c : a.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }

        for (char c : b.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) < 0)
                    return false;
            } else
                return false;
        }

        return true;
    }

    private static void AzuzAnagram(String a, String b) {
        if (isAnagrams(a, b))
            System.out.print(ANAGRAM);
        else
            System.out.println(NOT_ANAGRAM);
    }

    public static void main(String[] args) {
        System.out.println("Bismi ALLAH");

        AzuzAnagram("abd", "adb");
    }
}