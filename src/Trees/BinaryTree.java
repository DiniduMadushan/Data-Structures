
package Trees;


import java.util.Scanner;

public class BinaryTree {

    public class TreeNode {

        TreeNode left;
        TreeNode right;
        int data;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    TreeNode root;

    BinaryTree() {
        root = null;
    }

    public TreeNode Insert(TreeNode root, int dataToBeInserted) {
        if (root == null) {
            root = new TreeNode(dataToBeInserted);
            return root;
        }
        if (root.data > dataToBeInserted) {
            root.left = Insert(root.left, dataToBeInserted);
        } else if (root.data < dataToBeInserted) {
            root.right = Insert(root.right, dataToBeInserted);
        }
        return root;
    }

    public TreeNode Search(TreeNode root, int dataToBeSearched) {
        if (root == null || root.data == dataToBeSearched) {
            return root;
        }
        if (root.data > dataToBeSearched) {
            return Search(root.left, dataToBeSearched);
        } else {
            return Search(root.right, dataToBeSearched);
        }
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + "");
        inorder(root.right);
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + "");
        inorder(root.left);

        inorder(root.right);
    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);

        inorder(root.right);
        System.out.println(root.data + "");
    }

    public void InsertInToTree(int DataToBeInsert) {
        root = Insert(root, DataToBeInsert);
    }

    public TreeNode SearchIntoTree(int DataToBeSearched) {
        return Search(root, DataToBeSearched);
    }

    public void inOrderTraversal() {
        inorder(root);
    }

    public void preOrderTraversal() {
        preorder(root);
    }

    public void postOrderTraversal() {
        postorder(root);
    }

    
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers will be added? ");
        int n = scan.nextInt();

        System.out.println("Enter " + n + "numbers");
        for (int i = 0; i < n; i++) {
            int DataToBeInsert = scan.nextInt();
            bst.InsertInToTree(DataToBeInsert);

        }
        System.out.println("Successfully inserted data");
        System.out.println("Enter the number what you search");
        n = scan.nextInt();

        if (bst.SearchIntoTree(n) != null) {
            System.out.println("Number is found");
        } else {
            System.out.println("Number not found");
        }

        System.out.println("Inorder traversal : ");
        bst.inOrderTraversal();

        System.out.println("Pre traversal : ");
        bst.preOrderTraversal();

        System.out.println("Post traversal : ");
        bst.postOrderTraversal();

    }

}

