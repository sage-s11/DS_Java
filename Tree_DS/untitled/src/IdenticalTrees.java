public class IdenticalTrees {
    static boolean isIdentical(Node r1, Node r2){
        boolean flag = true;
        //if both trees are null, they're identical
        if(r1==null && r2==null){
            return true;
        }
        //if any one is null, they're not identical
        if(r1==null || r2==null){
            return false;
        }
        //compare data && recursion on left subtrees && recursion on right subtrees
        return (r1.data==r2.data)&&(isIdentical(r1.left,r2.left))&&(isIdentical(r1.right,r2.right));
    }
    public static void main(String[] args) {
        // tree 1
        //        1
        //       / \
        //      2   3
        //     /
        //    4
        Node r1 = new Node(1);
        r1.left = new Node(2);
        r1.right = new Node(3);
        r1.left.left = new Node(4);

        //ree 2
        //        1
        //       / \
        //      2   3
        //     /
        //    4
        Node r2 = new Node(1);
        r2.left = new Node(2);
        r2.right = new Node(3);
        r2.left.left = new Node(4);

        System.out.println(isIdentical(r1,r2));
    }
}
