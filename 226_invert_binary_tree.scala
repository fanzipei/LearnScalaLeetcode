object Solution {
    def invertTree(root: TreeNode): TreeNode = {
        if (root == null) null
        else {
            val tmp = invertTree(root.left)
            root.left = invertTree(root.right)
            root.right = tmp
            root
        }
    }
}
