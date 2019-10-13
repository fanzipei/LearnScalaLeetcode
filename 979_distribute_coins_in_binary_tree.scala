object Solution {
    
    def balanceCoins(root: TreeNode): (Int, Int) = {
        if (root == null){
            (0, 0)
        }else{
            val rst_l = balanceCoins(root.left)
            val rst_r = balanceCoins(root.right)
            (rst_l._1 + rst_r._1 + Math.abs(rst_l._2) + Math.abs(rst_r._2), root.value - 1 + rst_l._2 + rst_r._2)            
        }
    }
    
    def distributeCoins(root: TreeNode): Int = {
        balanceCoins(root)._1
    }
}
