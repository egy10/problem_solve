package binarytree;

import java.util.ArrayList;
import java.util.List;

public class BTthree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.createNewNode(2);
        root.left = binaryTree.createNewNode(7);
        root.right = binaryTree.createNewNode(5);
        root.left.left = binaryTree.createNewNode(2);
        root.left.right = binaryTree.createNewNode(6);
        root.left.right.left = binaryTree.createNewNode(5);
        root.left.right.right = binaryTree.createNewNode(11);
        root.right.right = binaryTree.createNewNode(9);
        root.right.right.left = binaryTree.createNewNode(4);
                    //      2
                    // 7        5
        //         2      6         9
        //            5     11   4
        binaryTree.inorder(root);
        System.out.println();
        binaryTree.postorder(root);
        System.out.println();
       // binaryTree.getBranchSum(root);
        List<Integer> result = binaryTree.getBranchSum(root);
        System.out.println(result);
    }

    public static class Node {
        public int value;
        Node left;
        Node right;

    }

    static class BinaryTree {
        public static Node createNewNode(int value) {
            Node node = new Node();
            node.value = value;
            node.left = null;
            node.right = null;
            return node;
        }

        public void inorder(Node node) {
            if (node == null) {
                return;
            }
            inorder(node.left);
            System.out.print(" " + node.value);
            inorder(node.right);
        }

        public void postorder(Node node) {
            if (node == null) {
                return;
            }
            System.out.print(" " + node.value);
            postorder(node.left);
            postorder(node.right);
        }

        // Branch sum
        // Branch Sum from algoexpert
        public List<Integer> getBranchSum(Node root) {
            List<Integer> sums = new ArrayList<>();
            calculateBranch(root, 0, sums);
            return sums;
        }

        public static void calculateBranch(Node node, int runningSum, List<Integer> sums) {
            if (node == null) {
                return;
            }
            int newRunningSum = runningSum + node.value;
            if (node.left == null && node.right == null){
                sums.add(newRunningSum);
                return;
            }
            calculateBranch(node.left, newRunningSum, sums);
            calculateBranch(node.right, newRunningSum, sums);
           // System.out.print(" " + node.value);
        }
    }
}
