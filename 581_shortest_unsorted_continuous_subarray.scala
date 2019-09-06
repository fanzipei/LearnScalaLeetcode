object Solution {
    def findUnsortedSubarray(nums: Array[Int]): Int = {
        if (nums.isEmpty) 0 else{
          val maxLeft = (nums.scanLeft(nums.head)(Math.max).tail zip nums)
          val minRight = (nums.scanRight(nums.last)(Math.min).init zip nums)
          val rightIndex = maxLeft.toList.lastIndexWhere(x => x._1 != x._2)
          val leftIndex = minRight.toList.indexWhere(x => x._1 != x._2)
          if(leftIndex < 0) 0 else (rightIndex - leftIndex + 1)
        }
    }
}
