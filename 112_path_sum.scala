object Solution {
    def hasPathSum(root: TreeNode, sum: Int): Boolean = {
        if (root == null) false
        else if (root.left == null && root.right == null) sum == root.value
        else hasPathSum(root.left, sum - root.value) || hasPathSum(root.right, sum - root.value)
    }
}
