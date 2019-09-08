object Solution {
    def rob(nums: Array[Int]): Int = {
        if (nums.isEmpty) 0 else {
            val pivot = nums.length / 2
            Math.max(nums(pivot) + rob(nums.slice(0, pivot - 1)) + rob(nums.slice(pivot + 2, nums.length)), rob(nums.slice(0, pivot)) + rob(nums.slice(pivot + 1, nums.length))) 
        }
    }
}
