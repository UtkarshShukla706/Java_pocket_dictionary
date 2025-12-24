public class BinaryTree2 {
    // here i am goign to craete the binary tree for the rpeorder traversal of the element in the binary tree

    // in the preorder traversal it follows the NLR order

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    // class for the calling of the binary tree

    public static class BinaryTree{
        static int index=-1;
        public Node buildTree(int nodes[]){

            index++;
            if(nodes[index]==-1){
                return null;
            }

            Node newNode=new Node(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }


        // for the preorder traversal of the binary tree

        public void preorder(Node root){
            if(root==null){
                return;
            }

            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }


    // main functiion for the insertion of the element in the tree

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);

        tree.preorder(root);
    }
}
