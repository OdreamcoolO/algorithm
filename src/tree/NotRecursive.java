package tree;

import secondday.TreeNode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @ Author   ：clt.
 * @ Date     ：Created in 9:02 2019/7/14
 */
public class NotRecursive {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(8);
        root.right.right = new TreeNode(7);
        inOrder(root);
        System.out.println();
    }

    //    非递归树的先序周游
    public static void preOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (stack.size() > 0) {
            TreeNode node = stack.pop();
            System.out.print(node.val + "\t");
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    //    非递归树的中序周游
    public static void inOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                System.out.print(root.val + "\t");
                root = root.right;
            }
        }
    }

    //    非递归树的后序周游
    public static void postOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
        }
    }

    //    树的广度遍历，即层次遍历
    public static void Breadth(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        list.addLast(root);
        while (list.size() > 0) {
            TreeNode node = list.removeFirst();
            System.out.print(node.val+"\t");
            if (node.left != null) {
                list.addLast(node.left);
            }
            if (node.right != null) {
                list.addLast(node.right);
            }
        }
    }
}
