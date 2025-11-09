public class Trees {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node root) {
        if(root== null) return;
        System.out.print(root.val + "->");
        if(root.left!= null) {
            System.out.print(root.left.val + " ");
        }
        else {
            System.out.print("Null" + " ");
        }
        if(root.right!= null) {
            System.out.print(root.right.val);
        }
        else {
            System.out.print("Null");
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
//        System.out.println(root.val);
        Node a = new Node(11);
        Node b = new Node(12);
        root.left = a;
        root.right = b;
        display(root);
    }
}
