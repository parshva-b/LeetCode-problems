/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        
        int lDia = diameterOfBinaryTree(root.left);
        int rDia = diameterOfBinaryTree(root.right);
        
        return Math.max(lHeight+rHeight, Math.max(lDia, rDia));
    }
    
    public int height(TreeNode root) {
        if(root == null) return 0;
        
        return (1+ Math.max(height(root.left), height(root.right)));
    }
}