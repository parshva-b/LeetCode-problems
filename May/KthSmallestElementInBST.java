/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode prev = null;
    
    public int kthSmallest(TreeNode root, int k) {
        TreeNode temp = null;
        while(k>0) {
            temp = getLeast(root);
            if(temp.left == null && temp.right == null && prev != null) {
                if(prev.left == temp) prev.left = null;
                else prev.right = null;
            }
            else if(temp.right != null) {
                if(prev == null) root = root.right;
                else prev.left = temp.right;
            }
            
            k--;
        }
        return temp.val;
    }
    
    public TreeNode getLeast(TreeNode root) {
        if(root.left != null) {
            prev = root;
            return getLeast(root.left);
        }
        return root;
    }
}
