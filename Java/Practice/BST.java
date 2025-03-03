package Practice;

public class BST {
    class Node {
        int data;
        Node left, right;
        int height;

        Node(int item, int h) {
            data = item;
            left = right = null;
            height = h;
        }
    }

    // properties
    Node root;
    int size;

    // constructor
    public BST() {
        root = null;
        size = 0;
    }

    // insertion
    public void insert(int key) {
        root = insertRec(root, key, 0);
        size++;
    }
    private Node insertRec(Node curr, int key, int h) {
        if (curr == null) {
            curr = new Node(key,h);
            return curr;
        }
        if (key < curr.data) {
            curr.left = insertRec(curr.left, key, h+1);
        }
        else if (key > curr.data) {
            curr.right = insertRec(curr.right, key, h+1);
        }
        return curr;
    }

    // basic traveral
    public String preOrder() {
        return preOrderRec(root);
    }
    private String preOrderRec(Node n) {
        StringBuilder sb = new StringBuilder();
        if (n != null) {
            sb.append(n.data).append(":").append(n.height).append(" ");
            sb.append(preOrderRec(n.left));
            sb.append(preOrderRec(n.right));
        }
        return sb.toString();
    }

    // special printing methods


    @Override
    public String toString() {
        return preOrder();
    }
}
