
class Solution {

    private static int facto(int n) {
        if (n <= 1)
            return 1;
        return n * facto(n - 1);
    }

    private static int lastDigitFacto(int n) {
        int factoriel = facto(n);
        return factoriel % 10;
    }

    public static void main(String[] args) {
        System.out.println("Bismi Allah");

        int res = lastDigitFacto(10);
        System.out.println(res);
    }
}