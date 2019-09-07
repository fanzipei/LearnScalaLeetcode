object Solution {
    def sortedArrayToBST(nums: Array[Int]): TreeNode = {
        if (nums.isEmpty) null
        else{
            val pivot = nums.length / 2
            val root = new TreeNode(nums(pivot))
            root.left = sortedArrayToBST(nums.slice(0, pivot))
            root.right = sortedArrayToBST(nums.slice(pivot + 1, nums.length))
            root
        }
    }
}
