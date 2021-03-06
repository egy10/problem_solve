package problemsFifty.binaryTree;

public class NodeDepths {
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

    }
    public static class Node{
        int value;
        Node left;
        Node right;
    }
    public static class BinaryTree {

        public Node createNewNode(int value) {
           Node n = new Node();
            n.value = value;
            n.left = null;
            n.right = null;
            return n;
        }
        public static int nodeDepths(Node root) { return nodeDepthHelper(root, 0);
        }
        public static int nodeDepthHelper(Node tree, int level) {
            if (tree == null) {
                return 0;
            }
            return level + nodeDepthHelper(tree.left, level+ 1) + nodeDepthHelper(tree.right, level + 1);
        }
    }
}
// Distance between a node in a BT and the tree's root is called the node's depth
//Write function that takes in a BT and returns the sum of its node' depth.
//Each BT node has int val, left, right child nodes. Children can be either be BT nodes themselves or Null.
