import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    // sliding window
    private static void maxProfit(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int maxProfit = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        while (left <= right) {
            int currentSum = 0;
            for (int i = left; i <= right; i++) {
                currentSum += list.get(i);
            }
            maxProfit = Math.max(maxProfit, currentSum);
            // maxProfit = Math.max(maxProfit,
            // list.stream().mapToInt(Integer::intValue).sum());
            // when to move left
            if (list.get(left) < list.get(right)) {
                left++;
            } else {
                right--;
            }
            // and when right

        }
        if (maxProfit > 0)
            System.out.println(maxProfit);
        else
            System.out.println("better luck next year");
    }

    public static void main(String[] args) {
        System.out.println("Bismi Allah");

        int nums[] = { -1 };
        maxProfit(nums);
        int nums2[] = { 1, 2, -2, 8, -4, 8 };
        maxProfit(nums2);
    }
}