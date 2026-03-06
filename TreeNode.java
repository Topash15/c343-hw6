public class TreeNode
{
    public int account_number;
    public String name;
    public double balance;
    public TreeNode left;
    public TreeNode right;
    
    public TreeNode(int account_number, String name, double balance)
    {
	this.account_number = account_number;
        this.name = name;
        this.balance = balance;
	this.left = null;
	this.right = null;
    }
}
