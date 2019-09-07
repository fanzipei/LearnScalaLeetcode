object Solution {
    
    def maxDepth(root: TreeNode): (Int, Int) = {
        if (root == null){
            (0, 0)
        }else{
            val maxLeft = maxDepth(root.left)
            val maxRight = maxDepth(root.right)
            (Math.max(maxLeft._1 + 1, maxRight._1 + 1), Math.max(Math.max(maxLeft._2, maxRight._2), maxLeft._1 + maxRight._1))            
        }
    }
    
    def diameterOfBinaryTree(root: TreeNode): Int = {
        maxDepth(root)._2
    }
}
