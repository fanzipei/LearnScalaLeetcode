object Solution {
    def minDepth(root: TreeNode): Int = {
        if (root == null){
            0
        }else if (root.left == null && root.right == null){
            1
        }else if (root.left == null) {
            minDepth(root.right) + 1
        }else if (root.right == null) {
            minDepth(root.left) + 1
        }else{
            Math.min(minDepth(root.left), minDepth(root.right)) + 1
        }
    }
}
