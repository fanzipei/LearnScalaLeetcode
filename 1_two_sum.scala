object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        val combs = for {i <- 0 to nums.length - 1; j <- 0 to nums.length - 1; if (i != j && nums(i) + nums(j) == target)} yield i -> j
        val rst = combs.head
        Array(rst._1, rst._2)
    }
}
