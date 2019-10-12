object Solution {
    def maxIncreaseKeepingSkyline(grid: Array[Array[Int]]): Int = {
        val skyline_row = grid.map(_.max)
        val skyline_col = grid.transpose.map(_.max)
        
        val maxInc = for {
            i <- 0 until grid.length
            j <- 0 until grid(i).length
        } yield (skyline_row(i) min skyline_col(j)) - grid(i)(j)
        
        maxInc.sum
    }
}
