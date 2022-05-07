package binarytree;

public class BTthree {
    public static void main(String[] args) {

    }
    class Node{
        int data;
        Node left;
        Node right;

    }
    public class BinaryTree{
        public Node createNewNode (int val){
            Node node = new Node();
            node.data = val;
            node.left = null;
            node.right = null;
            return node;
        }



    }
}
