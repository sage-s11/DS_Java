 /*             12
              /   \
             8     18
           /        \
          5          11
 --> If the tree is empty then return 0
--> Otherwise, do the following
        Get the max depth of the left subtree recursively  i.e. call maxDepth( tree->left-subtree)
        Get the max depth of the right subtree recursively  i.e. call maxDepth( tree->right-subtree)
        Get the max of max depths of left and right subtrees and add 1 to it for the current node.
        max_depth = max(max_depth of left subtree, max depth of right subtree) + 1
        Return max_depth.
*/
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class MaxHeightOfTree {
    static int maxDepth(Node node) {
        if (node == null)
            return 0;
        // compute the depth of left and right
        // subtrees
        int lDepth = maxDepth(node.left);
        int rDepth = maxDepth(node.right);
        // use the larger one
        return Math.max(lDepth, rDepth) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(maxDepth(root));
    }
}
