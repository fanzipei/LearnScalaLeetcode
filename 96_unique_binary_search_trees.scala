object Solution {
    def numTrees(n: Int): Int = {
        (2 to n).foldLeft(Array(1, 1))((a, b) => a :+ (a zip a.reverse).map{case (x, y) => x * y}.sum).last
    }
}
