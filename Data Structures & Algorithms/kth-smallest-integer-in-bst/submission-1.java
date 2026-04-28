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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        int val = 0;
        while(true)
        {
            if(root != null)
            {
                st.push(root);
                root = root.left;
            }
            else
            {
                root = st.pop();
                val = root.val;
                
                if(--k == 0)
                break;
                root = root.right;
            }
        }
        return val;
    }

   
}
