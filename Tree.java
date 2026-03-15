public class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }

    public void resetRoot(TreeNode n) {
        root = n;
    }

    public void list_all_nodes() {
        list_subtree(root);
    }

    private void list_subtree(TreeNode t) {
        // your code goes here:
        // display the contents of all nodes in this subtree t
        // in in-order
        if (t == null) {
            return;
        }

        list_subtree(t.left);
        System.out.println(t.account_number + " " + t.name + " " + t.balance); // 1 Henry Smith 99.23
        list_subtree(t.right);
    }

    public double sum_of_balances() {
        return sum_of_balances_subtree(root);
    }

    private double sum_of_balances_subtree(TreeNode t) {
        // your code goes here:
        // return the total balances all accounts in this subtree t
        if (t == null) {
            return 0;
        }
        double total = t.balance;

        total += sum_of_balances_subtree(t.left);
        total += sum_of_balances_subtree(t.right);
        return total;
    }

    public int height() {
        return height_subtree(root);
    }

    private int height_subtree(TreeNode t) {

        // return -1 if tree is empty
        if (t == null) {
            return -1;
        }

        // if tree is not empty, there is at least one node. Height is at least 0
        int height = 0;

        // if the root has any children, height is 1
        if (t.left != null || t.right != null) {
            height = 1;
        }

        // check the height of the left and right nodes
        int leftHeight = height_subtree(t.left);
        int rightHeight = height_subtree(t.right);

        // If the nodes have a height, add the total height to them
        // Set height to the larger of the two
        if (leftHeight > 0 || rightHeight > 0) {
            leftHeight += height;
            rightHeight += height;
            if (leftHeight > rightHeight) {
                height = leftHeight;
            } else {
                height = rightHeight;
            }
        }
        return height;
    }
}
