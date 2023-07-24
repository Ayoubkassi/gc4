import java.util.HashMap;
import java.util.Map;

class Solution {

    static class Pos {
        int x;
        int y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static Map<Pos, Boolean> map = new HashMap<>();

    private static int numFreshRaspberries(char[][] refrigerator, int days) {
        int rows = refrigerator.length;
        int cols = refrigerator[0].length;
        if (days == 0) {
            int res = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (refrigerator[i][j] != 'x')
                        res++;
                }
            }
            return res;
        }

        // change tables

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (refrigerator[i][j] == 'x') {
                    // do our chanegs for adjacentes
                    // top
                    map.put(new Pos(Math.max(0, i - 1), j), true);
                    // refrigerator[Math.max(0, i - 1)][j] = 'x';
                    // bottom
                    map.put(new Pos(Math.min(rows - 1, i + 1), j), true);
                    // refrigerator[Math.min(rows - 1, i + 1)][j] = 'x';
                    // left
                    map.put(new Pos(i, Math.max(0, j - 1)), true);
                    // refrigerator[i][Math.max(0, j - 1)] = 'x';
                    // right
                    map.put(new Pos(i, Math.min(cols - 1, j + 1)), true);
                    // refrigerator[i][Math.min(cols - 1, j + 1)] = 'x';
                }
            }
        }

        // do our changes
        for (Pos pos : map.keySet()) {
            refrigerator[pos.x][pos.y] = 'x';
        }
        map.clear();
        return numFreshRaspberries(refrigerator, days - 1);

    }

    public static void main(String[] args) {
        System.out.println("Bismi Allah");

        char[][] refrigerator = {
                { 'o', 'o', 'o' },
                { 'o', 'x', 'o' },
                { 'o', 'o', 'o' }
        };

        int days = 1;

        int res = numFreshRaspberries(refrigerator, days);
        System.out.println(res);

    }
}