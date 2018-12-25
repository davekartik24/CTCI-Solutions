/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        
        if(root == null) return true;
        
        return validatingBST(root, null, null);
        
    } 
    
    public boolean validatingBST(TreeNode root, TreeNode lowerLimit, TreeNode upperLimit) {
        
        if(root == null) return true;
        
        if(lowerLimit != null && root.val <= lowerLimit.val) return false;
        
        if(upperLimit != null && root.val >= upperLimit.val) return false;
        
        return validatingBST(root.left, lowerLimit, root) && validatingBST(root.right, root, upperLimit); 
        
    }

}