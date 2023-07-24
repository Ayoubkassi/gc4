import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // i will write a function to get all levels of this tree ad List of lists
    // This ofc using BFS

    private static List<List<Integer>> allVeles(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                if (current != null) {
                    queue.add(current.left);
                    queue.add(current.right);
                    temp.add(current.val);
                }

            }

            if (temp.size() != 0)
                res.add(temp);
        }
        return res;
    }

    // so now it's simple just get List calculate sum for even
    private static int sumEvenLevels(TreeNode root) {
        List<List<Integer>> res = allVeles(root);
        int itter = 1;
        int answer = 0;
        for (List<Integer> list : res) {
            if (itter % 2 == 0) {
                answer += list.stream().mapToInt(Integer::intValue).sum();
            }

            itter++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Bismi Allah");

        TreeNode right = new TreeNode(3);
        TreeNode left = new TreeNode(2);
        TreeNode root = new TreeNode(1, left, right);
        // List<List<Integer>> res = allVeles(root);
        // for (List<Integer> list : res) {
        // for (int num : list) {
        // System.out.print(num + " ");
        // }
        // System.out.println();
        // }

        int res = sumEvenLevels(root);
        System.out.println(res);

    }
}