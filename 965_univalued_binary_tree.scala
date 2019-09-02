object Solution {
    def isUnivalTree(root: TreeNode, value: Int = -1): Boolean = {
        if (root == null) true
        else (if (value >= 0) (value == root.value) else true) && isUnivalTree(root.left, root.value) && isUnivalTree(root.right, root.value)
    }
}
