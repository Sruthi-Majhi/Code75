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
    int cnt = 0;
    public int goodNodes(TreeNode root) {

atEachLevel(root, root.val);
return cnt;
        
    }

    public void atEachLevel(TreeNode root, int greatest)
    {
        if(root == null)
        return;

        if(root.val >= greatest)
        {
            cnt++;
            greatest = root.val;
        }

        atEachLevel(root.left, greatest);
        atEachLevel(root.right, greatest);

    }
}
