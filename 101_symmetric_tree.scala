object Solution {
    def isSymmetric(root: TreeNode): Boolean = {
        if (root == null) true
        else isEqual(root.left, root.right)
    }
    
    def isEqual(left: TreeNode, right: TreeNode): Boolean = {
        if (left == null) right == null
        else if (right == null) left == null
        else (left.value == right.value) && isEqual(left.left, right.right) && isEqual(left.right, right.left)
    }
}
