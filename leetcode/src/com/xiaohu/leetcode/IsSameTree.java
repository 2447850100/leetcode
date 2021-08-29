package com.xiaohu.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import java.util.function.IntFunction;

/**
 * @author 小胡哥哥
 * NO BB show your code
 */
public class IsSameTree {
    public static void main(String[] args) {
        IsSameTree tree = new IsSameTree();
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(2);
        p.left = new TreeNode(1);
        p.right = new TreeNode(3);
        q.left = new TreeNode(1);
        q.right = new TreeNode(3);
        System.out.println(tree.isSameTree(p, q));
    }

   /**
    * 给你两个树的结点，判断两个结点是否一样
    * @param p
    * @param q
    * @return
    */
   public boolean isSameTree(TreeNode p, TreeNode q) {

       if (Objects.isNull(p) && Objects.isNull(q)) {
           return true;
       }
       if (Objects.isNull(p)) {
           return false;
       }
       if (Objects.isNull(q)) {
           return false;
       }
           return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
       }
    public boolean isSameTreePre1(TreeNode p, TreeNode q) {
        if (Objects.isNull(p) && Objects.isNull(q))  return true;
        if (Objects.isNull(p)) return false;
        if (Objects.isNull(q))  return false;

        Stack<TreeNode> stackP = new Stack<>();
        stackP.add(p);
        Stack<TreeNode> stackQ = new Stack<>();
        stackQ.add(q);
        while (!stackP.isEmpty() || !stackQ.isEmpty()) {
            TreeNode pNode = stackP.pop();
            TreeNode qNode = stackQ.pop();
            if (Objects.isNull(pNode) && Objects.isNull(qNode)) continue;
            if (Objects.isNull(pNode)) return false;
            if (Objects.isNull(qNode)) return false;
            if (!Objects.equals(pNode.val,qNode.val)) {
                return false;
            } else {
                stackP.add(pNode.right);
                stackQ.add(qNode.right);
                stackP.add(pNode.left);
                stackQ.add(qNode.left);
            }
        }
        return true;
    }

//      List pList = this.addTreeVal(p);
//      List qList = this.addTreeVal(q);
//      if (pList.size()!= qList.size()) {
//          return false;
//      }
//
//      return pList.equals(qList);
//   }
//   public List<?> addTreeVal(TreeNode root) {
//       List list = new ArrayList<>();
//      if (root==null) {
//          list.add(root);
//         return list;
//      }
//      list.addAll(addTreeVal(root.left));
//      list.add(root.val);
//      list.addAll(addTreeVal(root.right));
//      return list;
//   }
   }


     class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


