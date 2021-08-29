package com.xiaohu.leetcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class InorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        InorderTraversal traversal = new InorderTraversal();
        List<Integer> list = traversal.inorderTraversal(root);
        list.forEach(System.out::print);

    }


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;


        TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    '}';
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;

        }
//        SQLOutput

    }
}