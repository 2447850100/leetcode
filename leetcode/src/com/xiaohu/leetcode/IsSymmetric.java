package com.xiaohu.leetcode;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (null == root) {
            return true;
        }
       return doNode(root.left,root.right);
    }

    public boolean doNode(TreeNode root1,TreeNode root2) {
        if (null == root1 && null == root2) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            return doNode(root1.left,root2.right) && doNode(root1.right,root2.left);
        }
        return false;
    }
}
