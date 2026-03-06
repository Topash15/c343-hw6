public class Tree
{
    private TreeNode root;

    public Tree()
    {
        root = null;
    }
    
    public void resetRoot(TreeNode n)
    {
        root = n;
    }
    
    public void list_all_nodes()
    {
        list_subtree(root);
    }
	   
    private void list_subtree(TreeNode t)
    {
        // your code goes here:
        // display the contents of all nodes in this subtree t
        // in in-order
    }
    
    public double sum_of_balances()
    {
	return sum_of_balances_subtree(root);
    }

    private double sum_of_balances_subtree(TreeNode t)
    {
	// your code goes here:
        // return the total balances all accounts in this subtree t
    }
    
    public int height()
    {
	return height_subtree(root);
    }

    private int height_subtree(TreeNode t)
    {
	// your code goes here:
        // return the height of this subtree t
    }
}


