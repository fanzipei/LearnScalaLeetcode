object Solution {
    
    def solve(grid: Array[Array[Int]], pathMin: Array[Array[Int]], x_max: Int, y_max: Int): Int = {
        if (pathMin(y_max)(x_max) < 0){
            -pathMin(y_max)(x_max)
        }else if (x_max == 0){
            (0 to y_max).map(grid(_)(0)).sum
        }else if (y_max == 0){
            grid(0).take(x_max + 1).sum
        }else{
            pathMin(y_max)(x_max) = -(Math.min(solve(grid, pathMin, x_max - 1, y_max), solve(grid, pathMin, x_max, y_max - 1)) + grid(y_max)(x_max))
            -pathMin(y_max)(x_max)
        }
    }
    
    def minPathSum(grid: Array[Array[Int]]): Int = {
        val x_max = grid(0).length - 1
        val y_max = grid.length - 1
        solve(grid, grid.clone, x_max, y_max)
    }
}
