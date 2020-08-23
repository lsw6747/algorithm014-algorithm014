package result;

import java.util.ArrayList;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        inOrder(root, list);
        return list;
    }

    public void inOrder(TreeNode root, List list) {
        if(root.left != null) inOrder(root.left, list);
        if(root != null) list.add(root.val);
        if(root.right != null) inOrder(root.right, list);
    }
}