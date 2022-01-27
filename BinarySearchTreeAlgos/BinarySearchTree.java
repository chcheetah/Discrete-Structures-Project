package BinarySearchTreeAlgos;
import java.util.Scanner;
public class BinarySearchTree {
    int cur = 1;
    public String preor = "";
    public String postor = "";
    public String inor = "";
    public class Node {
        //instance variable of Node class
        public int data;
        public Node left;
        public Node right;

        //constructor
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // instance variable
    public Node root;

    // constructor for initialise the root to null BYDEFAULT
    public BinarySearchTree() {
        this.root = null;
    }

    // insert method to insert the new Date
    public void insert(int newData) {
        this.root = insert(root, newData);
    }

    public Node insert(Node root, int newData) {
        // Base Case: root is null or not
        if (root == null) {
            // Insert the new data, if root is null.
            root = new Node(newData);
            // return the current root to his sub tree
            return root;
        }
        // Here checking for root data is greater or equal to newData or not
        else if (root.data >= newData) {
            // if current root data is greater than the new data then now process the left sub-tree
            root.left = insert(root.left, newData);
        } else {
            // if current root data is less than the new data then now process the right sub-tree
            root.right = insert(root.right, newData);
        }
        return root;
    }

    // method for search the data , is data present or not in the tree ?
    public boolean search(int data) {
        return search(this.root, data);
    }
    public int searchpos(int data){
        return searchpos(this.root,data,this.cur);
    }
    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return search(root.left, data);
        }
        return search(root.right, data);
    }
    private int searchpos(Node root, int data, int cur ){

        if ( root == null ){
            return -1;
        }
        else if (root.data == data){
            return cur;
        }
        else if (root.data > data){
            cur = cur*2;
            System.out.println(cur);
            return searchpos(root.left,data,cur);
        }
        cur = cur*2 +1;
        System.out.println(cur);
            return searchpos(root.right,data,cur);
    }
    //Traversal
    public void preorder() {
        preorder(root);
        System.out.println();
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preor = preor + " " +  root.data;
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(){
        inorder(root);
        System.out.println();
    }
    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inor += root.data;
        inor += " ";
        inorder(root.right);
    }
    public void postorder(){

        postorder(root);
        System.out.println();
    }
    public void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
        postor += root.data;
        postor += " ";
    }
    public static void main(String[] args) {
        Scanner nu = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int[] x = {8,5,9,3,7,11,2,6,54,76,99,33};
        for(int i:x){
            bst.insert(i);
        }
        bst.preorder();
        bst.inorder();
        bst.postorder();
        System.out.println("what do you want to search for?");
        int pew = nu.nextInt();

        boolean d = bst.search(pew);
        System.out.println(d);
        System.out.println(bst.searchpos(pew));
    }
}
