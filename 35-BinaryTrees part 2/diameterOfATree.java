
public class diameterOfATree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Calculate height
    public static int heights(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heights(root.left);
        int rightHeight = heights(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    //Diameter 1st approach
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHt = heights(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = heights(root.right);

        int selfDiam = leftHt + rightHt + 1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }

        return true;
    }

    public static boolean match(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(subRoot, root)) {
                return true;
            }
        }
        return match(root.left, subRoot) || match(root.right, subRoot);
    }

    // 2nd Approach  
    public static void main(String[] args) {

        /*
                       1
                      / \
                     2   3
                    / \   \
                   4   5   6  
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //System.out.println(diameter(root));
        /*
                       1
                      / \
                     2   3
         */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        System.out.println(match(root, subRoot));
    }
}
     
    
