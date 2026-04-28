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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> lt = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size; i++){
            TreeNode curr = q.remove();
            if(curr == null) continue;
            q.add(curr.left);
            q.add(curr.right);
            lt.add(curr.val);

            }
            if (lt.size() > 0)ans.add(lt);


        }
        return ans;
    }
}
