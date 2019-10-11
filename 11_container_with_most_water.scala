object Solution {

    def maxArea(height: Array[Int]): Int = {
        @annotation.tailrec
        def maxAreaNoArray(beg: Int, end: Int, maxarea: Int): Int = {
            if (end - beg < 2) maxarea else{
                val headHeight = height(beg)
                val lastHeight = height(end - 1)
                if (headHeight < lastHeight){
                    maxAreaNoArray(beg + 1, end, (maxarea max (headHeight * (end - beg - 1))))            
                }else{
                    maxAreaNoArray(beg, end - 1, (maxarea max (lastHeight * (end - beg - 1))))   
                }
            }
        }
        
        maxAreaNoArray(0, height.length, 0)
    }
}
