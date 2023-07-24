import java.util.HashMap;
import java.util.Map;

class Solution {

    private static String ibtissamPassword(String s) {
        if (s.length() == 1)
            return s;
        Map<Character, Boolean> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c))
                sb.append(c);
            map.put(c, true);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Bismi Allah");

        String res = ibtissamPassword("acba");
        System.out.println(res);
    }
}