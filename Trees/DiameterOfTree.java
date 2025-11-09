package Trees;

public class DiameterOfTree {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
        this.val = val;
        }
    }

    public static int height(Node root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int diameter(Node root) {
        int left = diameter(root.left);
        int right = diameter(root.right);
        int newRoot = height(root.left) + height(root.right);
        if(root.left != null) newRoot++;
        if(root.right != null) newRoot++;
        return Math.max(left , Math.max(right, newRoot));
    }

    public static void main(String[] args) {

    }
}
