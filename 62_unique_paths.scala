object Solution {
    def uniquePaths(m: Int, n: Int): Int = {
        if (m < n) uniquePaths(n, m)
        else{
            val N = m + n - 2
            val K = n - 1
            (1 to N).foldLeft(1 +: Array.fill[Int](K)(0))((x, y) => 1 +: (x.tail zip x.init).map{case (x, y) => x + y}).last
        }
    }
}
