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

        // First process the root
        if(root==null) return null;
        TreeNode temp= root.left;
        root.left =root.right;
        root.right= temp;

        // Then the left subtree & lastly the right subtree
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
