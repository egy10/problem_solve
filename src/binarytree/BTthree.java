package binarytree;

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

        binaryTree.inorder(root);


    }
    static class Node{
        int data;
        Node left;
        Node right;

    }
    static class BinaryTree{
        public Node createNewNode(int val){
            Node node = new Node();
            node.data = val;
            node.left = null;
            node.right = null;
            return node;
        }
        public void inorder(Node node) {
            if (node == null){
                return;
            }
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }

    }
}
