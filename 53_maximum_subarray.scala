object Solution {
    def maxSubArray(nums: Array[Int]): Int = {
        val accSum = nums.toList.scanLeft(0)(_ + _).tail
        (accSum.scanLeft(0)(Math.min(_, _)).init zip accSum).map(x => x._2 - x._1).max
    }
}
