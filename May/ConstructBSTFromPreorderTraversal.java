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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0) return null;
        if(preorder.length == 1) return new TreeNode(preorder[0]);
        
        Stack<TreeNode> tos = new Stack<>();
        TreeNode root = new TreeNode(preorder[0]);
        tos.push(root);
        TreeNode ptr = root;
        int i = 1;
        
        while(!tos.isEmpty() && i < preorder.length) {
			// System.out.println(tos.peek().val+" "+ptr.val);
            if(preorder[i] < ptr.val) {
                ptr.left = new TreeNode(preorder[i]);
                ptr = ptr.left;
                tos.push(ptr);
            }
            else {
                while(preorder[i] > ptr.val) {
                    ptr = tos.pop();
					// System.out.println(ptr.val);
                    if( tos.isEmpty() || (!tos.isEmpty() && tos.peek().val > preorder[i])) {
						ptr.right = new TreeNode(preorder[i]);
                        ptr = ptr.right;
                        tos.push(ptr);
                    }
                }   
            }
            i++;
        }
        
        return root;
    }
}