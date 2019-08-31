import scala.util.Sorting.quickSort

object Solution {
    def majorityElement(nums: Array[Int]): Int = {
        val nums_sorted = scala.util.Sorting.quickSort(nums)
        nums(nums.length / 2)
    }
}
