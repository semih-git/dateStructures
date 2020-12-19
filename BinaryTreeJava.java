class Node{
    public int data;
    public Node left,right;

    public Node(int data){
        this.data = data;
    }
}

public class BinaryTreeJava{
    public static Node root;

    public static void main(String[] args) {
        root = new Node(314);
        // B root
        root.left = new Node(6);
        // I root
        root.right = new Node(6);

        // B's left child(C)
        root.left.left = new Node(271);
        //B's rigth child(F)
        root.left.right = new Node(561);


        // B's left child(C)
        root.right.left = new Node(2);
        //B's rigth child(F)
        root.right.right = new Node(271);
        
        // 271 6 561 314 2 6 271
        System.out.print("InOrder Traverse: ");
        inOrderTraverse(root);
        System.out.println();

        // 314 6 271 561 6 2 271
        System.out.print("PreOrder Traverse: ");
        preOrderTraverse(root);
        System.out.println();

        // 271 561 6 2 271 6 314
        System.out.print("PostOrder Traverse: ");
        postOrderTraverse(root);
        System.out.println();
    }


    // Inorder Traver - left, root, right
    public static void inOrderTraverse(Node root){
        //Recursion 
            // Base case - Recursion durma noktasi  
            // Recursive - Methodun kendisini cagiricaz
        if(root != null){
            inOrderTraverse(root.left);
            System.out.print(root.data + "  ");
            inOrderTraverse(root.right);
        }
    }

    // PreOrder Traverse - root, left, right
    public static void preOrderTraverse(Node root){
        //Recursion 
            // Base case - Recursion durma noktasi  
            // Recursive - Methodun kendisini cagiricaz
        if(root != null){
            System.out.print(root.data + "  ");
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
    }

     // PostOrder Traverse - left, right, root
    public static void postOrderTraverse(Node root){
        //Recursion 
            // Base case - Recursion durma noktasi  
            // Recursive - Methodun kendisini cagiricaz
        if(root != null){
            postOrderTraverse(root.left);
            postOrderTraverse(root.right);
            System.out.print(root.data + "  ");
        }
    }
}
