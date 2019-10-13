object Solution {
    def pruneTree(root: TreeNode): TreeNode = {
        if (root == null) null
        else{
            root.left = pruneTree(root.left)
            root.right = pruneTree(root.right)
            if (root.value == 0 && root.left == null && root.right == null){
                null
            }else{
                root
            }
        }
    }
}
