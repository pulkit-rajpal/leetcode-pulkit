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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxi = new int[1];
        height(root, maxi);
        return maxi[0];
    }
    
    
    public int height(TreeNode node, int[] maxi)
    {
        if (node == null) return 0;
        int ls = height(node.left, maxi);
        int rs = height(node.right,maxi);
        maxi[0] =  Math.max(maxi[0],ls+rs);
        return 1+ Math.max(ls,rs);       
    }
}
