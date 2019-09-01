object Solution {
    
    def balancedAndDepth(root: TreeNode): (Boolean, Int) = {
        if (root == null) (true, 0)
        else{
            val resLeft = balancedAndDepth(root.left)
            val resRight = balancedAndDepth(root.right)
            (resLeft._1 && resRight._1 && (Math.abs(resLeft._2 - resRight._2) <= 1), Math.max(resLeft._2 + 1, resRight._2 + 1))            
        }
    }
    
    def isBalanced(root: TreeNode): Boolean = {
        balancedAndDepth(root)._1
    }
}
