object Solution {
    def insertIntoBST(root: TreeNode, `val`: Int): TreeNode = {
        if (root == null){
            TreeNode(`val`)
        }else if (root.value > `val`){
            root.left = insertIntoBST(root.left, `val`)
            root
        }else{
            root.right = insertIntoBST(root.right, `val`)
            root
        }
    }
}
