object Solution {
    
    def transfer(root: TreeNode, base: Int = 0): Int = {
        if (root == null) base
        else{
            root.value += transfer(root.right, base)
            transfer(root.left, root.value)
        }
    }
    
    def bstToGst(root: TreeNode): TreeNode = {
        transfer(root)
        root
    }
}
