object Solution {
    def constructMaximumBinaryTree(nums: Array[Int]): TreeNode = {
        val maxIdx = nums.zipWithIndex.maxBy(_._1)._2
        val root = TreeNode(nums(maxIdx))
        if (maxIdx == 0) root.left = null
        else root.left = constructMaximumBinaryTree(nums.slice(0, maxIdx))
        if (maxIdx == nums.length - 1) root.right = null
        else root.right = constructMaximumBinaryTree(nums.slice(maxIdx + 1, nums.length))
        root
    }
}
