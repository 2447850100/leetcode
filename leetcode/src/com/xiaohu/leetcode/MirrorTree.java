package com.xiaohu.leetcode;

import java.util.Objects;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if (Objects.isNull(root)) {
            return null;
        }

        //return root;
        return changeNode(root);
    }

    private TreeNode changeNode(TreeNode root) {
        TreeNode temp = root.right;

            root.right = changeNode(root.left);


            root.left = changeNode(temp);

        return root;
    }
}
