
class Solution {

    private static void moveZeros(int[] nums) {
        int numZeros = 0;
        for (int num : nums) {
            if (num != 0)
                System.out.print(num + "  ");
            else
                numZeros++;
        }

        for (int i = 0; i < numZeros; i++) {
            System.out.print(0 + "  ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Bismi ALlah");

        int nums[] = { 1, 0, 2, 0, 3 };
        moveZeros(nums);

    }
}