class Solution{    
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d < 2) {
            TreeNode newroot = new TreeNode(v);
            if (d == 0) newroot.right = root;
            else newroot.left = root;
            return newroot;
        }
        if (root == null) return null;
        root.left = addOneRow(root.left, v, d == 2 ? 1 : d-1);
        root.right = addOneRow(root.right, v, d == 2 ? 0 : d-1);
        return root;
    }
}
