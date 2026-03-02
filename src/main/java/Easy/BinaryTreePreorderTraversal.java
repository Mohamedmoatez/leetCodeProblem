package Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;  // optional since default is null
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = null;  // optional since default is null


        List<Integer> result = preorderTraversal(root);
        System.out.println(result);

    }


    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
//        Collections.reverse(result);
        return result;
    }

    private static void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        preorderHelper(node.left, result);
        preorderHelper(node.right, result);
    }


    //  Iterative Solution (Using Stack)

//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        if (root == null) return result;
//
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//
//        while (!stack.isEmpty()) {
//            TreeNode curr = stack.pop();
//            result.add(curr.val);
//
//            if (curr.right != null) {
//                stack.push(curr.right); // Push right first so left is processed first
//            }
//            if (curr.left != null) {
//                stack.push(curr.left);
//            }
//        }
//
//        return result;
//    }


    // Preorder Traversal : Root | Left | Right

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}



