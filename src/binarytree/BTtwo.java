package binarytree;
// Total number of leaf nodes:

public class BTtwo {
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

        System.out.println();
        binaryTree.inorder(root);

        System.out.println("Number of leaf nodes: " + binaryTree.getNumberOfLeafNodes(root));
        System.out.println("Get height tree: " + binaryTree.getHeightOfTree(root));

        System.out.println("Level 1: ");
        binaryTree.printAtGivenLevel(root, 1);
        System.out.println("Level 2: ");
        binaryTree.printAtGivenLevel(root, 2);
        System.out.println("Level 3: ");
        binaryTree.printAtGivenLevel(root, 3);
        System.out.println("Level 4: ");
        binaryTree.printAtGivenLevel(root, 4);

        System.out.println("The level order");
        binaryTree.levelOrderTraversalUsingRecursion(root);

    }
    public static class Node {
        int data;
        Node left;
        Node right;

    }
    static class BinaryTree{
        public Node createNewNode(int val) {
            Node n = new Node();
            n.data = val;
            n.left = null;
            n.right = null;
            return n;
        }

        public void inorder(Node node) {
            if (node == null) {
                return;
            }
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
 // the number of leaf nodes
        public int getNumberOfLeafNodes(Node node) {
            if (node == null) {
                return 0;
            }
            if (node.left == null && node.right == null) {
                return 1;
            }
            return getNumberOfLeafNodes(node.right) + getNumberOfLeafNodes(node.left);
        }
 // Get height of a binary tree/ node
         public int getHeightOfTree (Node node) {
            if (node == null) {
                return 0;
            }
            return max(getHeightOfTree(node.left), getHeightOfTree(node.right)) + 1;

         }
         private int max(int a, int b) {
            return a > b ? a : b;
         }
 // Print elements at given level in BT
        public void printAtGivenLevel(Node node, int level) {
            if (node == null) {
                return;
            }
            if (level == 1) {
                System.out.println(node.data);
                return;
            }
            printAtGivenLevel(node.left, level - 1);
            printAtGivenLevel(node.right, level - 1);
        }
 // Print element in Level order using recursion
            public void levelOrderTraversalUsingRecursion(Node node) {
                if (node == null){
                return;
                }
                int height = getHeightOfTree(node);
                for (int i = 0; i <= height; i++) {
                    printAtGivenLevel(node, i + 1);
                    System.out.println();
                }

            }
    }


}
