

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class CheckBalanced {
    
    boolean balancedFlag = true;
      
    public boolean isBalanced(TreeNode root) {  
    
        if(root == null) return true;
        
        balanceCheck(root);
        
        return balancedFlag;
    } 
    
    public int balanceCheck(TreeNode root) {
        
        if(root == null) return 0;
        
        int l = balanceCheck(root.left);
        int r = balanceCheck(root.right);
        
        if(Math.abs(l - r) > 1) balancedFlag = false;
        
        return Math.max(l , r) + 1;
    }

}