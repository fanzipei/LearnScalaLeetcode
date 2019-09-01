object Solution {
    
    def mergeTrees(t1: TreeNode, t2: TreeNode): TreeNode = {
        if (t1 == null && t2 == null) null
        else if (t1 == null) t2
        else if (t2 == null) t1
        else{
            t1.value += t2.value
            t1.left = mergeTrees(t1.left, t2.left)
            t1.right = mergeTrees(t1.right, t2.right)
            t1
        }
    }
}
