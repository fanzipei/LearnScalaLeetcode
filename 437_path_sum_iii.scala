object Solution {
    def pathSum(root: TreeNode, sum: Int, cur_sum: Int = 0, initial: Boolean = true): Int = {
        if (root == null) 0
        else (if (sum == cur_sum + root.value) 1 else 0) + pathSum(root.left, sum, cur_sum + root.value, false) + pathSum(root.right, sum, cur_sum + root.value, false) + (if (initial) (pathSum(root.left, sum, 0, true) + pathSum(root.right, sum, 0, true)) else 0)
    }
}
