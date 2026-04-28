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

 return atEachLevel(root, root.val);

        
    }

    public int atEachLevel(TreeNode root, int greatest)
    {
        int cnt = 0;
        if(root == null)
        return cnt;

        if(root.val >= greatest)
        {
            cnt = 1;
            greatest = root.val;
        }

        cnt += atEachLevel(root.left, greatest);
        cnt += atEachLevel(root.right, greatest);
        return cnt;

    }
}
