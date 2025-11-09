package Trees;

public class SizeOfBT {
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

    public static int size(Node root) {
        if(root == null) return 0;
        int size = size(root.left) + size(root.right) + 1;
        return size;
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

        System.out.println(size(root));
    }
}

