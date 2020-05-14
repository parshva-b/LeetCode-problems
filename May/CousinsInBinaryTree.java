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
    int depthX = -1, depthY = -1;
    TreeNode prev, parentX, parentY;
    
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, x, y, 0);
        return (!(parentX == parentY) && (depthX == depthY));
    }
    
    public void dfs(TreeNode cur, int x, int y, int depth) {
        if(cur == null) return;
        if(cur.val == x) {
            parentX = prev;
            depthX = depth;
            return;
        }
        if(cur.val == y) {
            parentY = prev;
            depthY = depth;
            return;
        }
        
        depth++;
        prev = cur;
        dfs(cur.left, x, y, depth);
        dfs(cur.right, x, y, depth);
    }
}