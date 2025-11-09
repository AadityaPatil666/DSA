package Trees;

public class nthLevel {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void nthlevel(Node root, int n) {
        if(root == null) return;
        if(n == 1) System.out.print(root.val + " ");
        nthlevel(root.left, n-1);
        nthlevel(root.right, n-1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a= new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;

        nthlevel(root, 3);
    }
}
