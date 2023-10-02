public class Node{
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int value() {
        return value;
    }

    public Node left() {
        return left;
    }

    public Node right() {
        return right;
    }
}