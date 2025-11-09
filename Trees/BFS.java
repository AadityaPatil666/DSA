package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
//        Add the first Node into the Queue i.e. Root of the tree
        if(root != null) q.add(root);

        while(q.size()>0) {
//            Making a temp node so that real tree is not affected
            Node temp = q.peek();
//            Add left Node of the element which is present in the Queue
            if(temp.left != null) q.add(temp);
//            Add right Node of the element which is present in the Queue
            if(temp.right != null) q.add(temp);
//            Print the first element present int the Queue
            System.out.println(temp.val);
//            Remove the first element present in the Queue
            q.remove();
        }
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

    }
}
