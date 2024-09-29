public class IsMirror {

    static boolean isMirror(Node r1, Node r2){
        if(r1==null && r2==null){
            return true;
        }
        if(r1==null || r2==null){
            return false;
        }

        return r1.data==r2.data && (isMirror(r1.left,r2.right)) && (isMirror(r1.right,r2.left));
    }

    public static void main(String[] args) {
        Node r1 = new Node(1);
        Node r2 = new Node(1);

        r1.left = new Node(3);
        r1.right = new Node(2);
        r1.right.left = new Node(5);
        r1.right.right = new Node(4);

        r2.left = new Node(2);
        r2.right = new Node(3);
        r2.left.left = new Node(4);
        r2.left.right = new Node(5);

        System.out.println(isMirror(r1,r2));
    }
}
