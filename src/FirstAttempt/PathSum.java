package FirstAttempt;

public class PathSum {

	// http://www.programcreek.com/2013/01/leetcode-path-sum/
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
            return false;
        }
        if (sum == root.val && root.left == null && root.right == null) {
            return true;
        }
        
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
