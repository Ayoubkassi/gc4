
class Solution {

    private static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    private static int primeNumbersLength(int num) {
        int res = 1;
        for (int i = 2; i < num; i++) {
            int current = gcd(num, i);
            if (current == 1)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int res = primeNumbersLength(2);
        System.out.println(res);
    }
}
