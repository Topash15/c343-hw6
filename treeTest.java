public class treeTest
{
    public static void main(String[] args)
    {
	Tree bst = new Tree();
        TreeNode n1 = new TreeNode(1, "Henry Smith", 99.23);
        bst.resetRoot(n1);
        
	TreeNode n2 = new TreeNode (13, "Mudge Doug", 94.44);
        n1.right = n2;
	TreeNode n3 = new TreeNode (3, "Biscuit Nancy", 100);
        n2.left = n3;
	TreeNode n4 = new TreeNode (11, "Louise Buick", 33);
        n3.right = n4;
	TreeNode n5 = new TreeNode(99, "Merlinda Shuez", 9999);
	n2.right = n5;
        TreeNode n6 = new TreeNode(12, "Unknown Unknown", 2000);
        n4.right = n6;
	TreeNode n7 = new TreeNode (2, "Joe Mess", 20);
        n3.left = n7;
        
        System.out.println("display all nodes in in-order:");
	bst.list_all_nodes();
        System.out.println("\ntotal balances: " + bst.sum_of_balances());
        System.out.println("height of the tree: " + bst.height());
    }
}

/*
output:

1 Henry Smith 99.23
2 Joe Mess 20.0
3 Biscuit Nancy 100.0
11 Louise Buick 33.0
12 Unknown Unknown 2000.0
13 Mudge Doug 94.44
99 Merlinda Shuez 9999.0

total balances: 12345.67
height of the tree: 4
*/

