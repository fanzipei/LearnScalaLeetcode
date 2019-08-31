object Solution {
    def maxDepth(root: TreeNode): Int = {
        if (root == null) return 0
        else Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right))
    }
}
