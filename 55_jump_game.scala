object Solution {
    def canJump(nums: Array[Int]): Boolean = {
        nums.init.foldLeft(1)((x: Int, y: Int) => if (x == 0) 0 else ((x - 1) max y)) > 0
    }
}
