package com.xiaohu.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class LowestCommonAncestor {
   public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
   Map<Integer,TreeNode> hashTree = new HashMap<>();
   Set<Integer> set = new HashSet<>();
   public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if (root == null) {
         return null;
      }
      getParent(root);
      while (p!=null) {
         set.add(p.val);
        p = hashTree.get(p.val);
      }
      while (q!=null) {
         if (set.contains(q.val)) {
            return q;
         }
         q = hashTree.get(q.val);
      }
      return null;
   }
   public void getParent(TreeNode root) {
      if (root.left!=null) {
         hashTree.put(root.left.val,root);
         getParent(root.left);
      }
      if (root.right!=null) {
         hashTree.put(root.right.val,root);
         getParent(root.right);
      }
   }
}
