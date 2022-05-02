package binarytree;

import com.sun.source.tree.BinaryTree;

public class BT {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = bt.createNewNode(2);
        root.left = bt.createNewNode(7);
        root.right = bt.createNewNode(5);
        root.left.left = bt.createNewNode(2);
        root.left.right = bt.createNewNode(6);
        root.left.right.left = bt.createNewNode(5);
        root.left.right.right = bt.createNewNode(11);
        root.right.right = bt.createNewNode(9);
        root.right.right.left = bt.createNewNode(4);

        System.out.println("Inorder: ");
        bt.inorder(root);
        System.out.println();

        System.out.println("Preorder" + " ");
        bt.preorder(root);
        System.out.println();

        System.out.println("Postorder" + " ");
        bt.postorder(root);

        System.out.println("Sum of nodes:  " + bt.getSumOfNodes(root));

        System.out.println("The difference: " + bt.getDifferenceEvenOddVal(root));
    }

    public static class Node {
        int data;
        Node left;
        Node right;
    }

    static class BinaryTree {

        public Node createNewNode(int val) {
            Node a = new Node();
            a.data = val;
            a.left = null;
            a.right = null;
            return a;
        }
// Inorder
        public void inorder(Node node) {
            if (node == null) {
                return;
            }
            inorder(node.left);
            System.out.println(node.data + " ");
            inorder(node.right);
        }
//Preorder
        public void preorder(Node node) {
            if (node == null) {
                return;
            }
            System.out.println(node.data + " ");
            preorder(node.left);
            preorder(node.right);

        }
//Postorder
        public void postorder(Node node) {
            if (node == null) {
                return;
            }
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data + " ");
        }

        public int getSumOfNodes(Node node) {
            if (node == null) {
                return 0;
            }
            return node.data + getSumOfNodes(node.right) + getSumOfNodes(node.left);
        }
// Difference of the even and odd elements using recursion
        public int getDifferenceEvenOddVal(Node node) {
            if (node == null) {
                return 0;
            }
            return node.data - getDifferenceEvenOddVal(node.left) - getDifferenceEvenOddVal(node.right);
        }

    }
}
