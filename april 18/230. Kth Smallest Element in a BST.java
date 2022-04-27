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
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        int cnt = 0;
        while(true){
            if(node != null){
                stack.push(node);
                node = node.left;
            }
            else {
                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                cnt++;
                if(cnt == k) return node.val;
                node = node.right;
            }
        }
        return -1;
    }
}
