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
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    
    public void invert(TreeNode cur) {
        if(cur == null) return;
        TreeNode temp = cur.right;
        cur.right = cur.left;
        cur.left = temp;
        invert(cur.left);
        invert(cur.right);
    }
}
